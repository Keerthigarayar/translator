# translator
complete web-based Language Translator application using Java with Spring Boot and the Google Translate API. This application allows users to enter text and translate it into different languages through a web interface.

* application.properties
     spring.thymeleaf.cache=false

  Step-by-Step Instructions to Run the Application
Clone or Download the Project:
Clone the repository or download the project files into a directory named language_translator.
Set Up the Environment Variable:
Set the GOOGLE_APPLICATION_CREDENTIALS environment variable to point to your service account key JSON file. This can be done in your terminal or command prompt:
On Windows:
bash
set GOOGLE_APPLICATION_CREDENTIALS="C:\path\to\your\service-account-file.json"

On macOS/Linux:
bash
export GOOGLE_APPLICATION_CREDENTIALS="/path/to/your/service-account-file.json"

Navigate to the Project Directory:
Open a terminal or command prompt and navigate to the project directory:
bash
cd path/to/language_translator

Build the Project:
Use Maven to build the project and download the necessary dependencies:
bash
mvn clean install

Run the Application:
Start the Spring Boot application:
bash
mvn spring-boot:run

Access the Application:
Open your web browser and go to http://localhost:8080.

Troubleshooting Tips
Check Java and Maven Installation: Make sure both Java and Maven are installed correctly by running:
bash
java -version
mvn -version

API Key Issues: Ensure that your Google Cloud API key is valid and that the Translation API is enabled for your project.
Firewall/Network Issues: If you encounter issues with accessing the Google Translate API, check your network settings or firewall.


  


