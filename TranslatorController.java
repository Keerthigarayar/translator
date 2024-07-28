package com.example.translator.controller;

import com.example.translator.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TranslatorController {
    
    @Autowired
    private TranslationService translationService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("languages", translationService.getLanguages());
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String inputText,
                            @RequestParam String srcLang,
                            @RequestParam String destLang,
                            Model model) {
        String translatedText = translationService.translate(inputText, srcLang, destLang);
        model.addAttribute("translatedText", translatedText);
        model.addAttribute("languages", translationService.getLanguages());
        return "index";
    }
}
