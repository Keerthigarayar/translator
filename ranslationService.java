package com.example.translator.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslationService {
    
    private final Translate translate = TranslateOptions.getDefaultInstance().getService();
    
    public String translate(String text, String sourceLang, String targetLang) {
        Translation translation = translate.translate(text, 
                Translate.TranslateOption.sourceLanguage(sourceLang), 
                Translate.TranslateOption.targetLanguage(targetLang));
        return translation.getTranslatedText();
    }

    public Map<String, String> getLanguages() {
        Map<String, String> languages = new HashMap<>();
        languages.put("en", "English");
        languages.put("es", "Spanish");
        languages.put("fr", "French");
        languages.put("de", "German");
        languages.put("zh", "Chinese");
        // Add more languages as needed
        return languages;
    }
}
