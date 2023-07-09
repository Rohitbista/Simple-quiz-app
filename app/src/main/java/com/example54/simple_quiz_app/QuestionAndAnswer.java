package com.example54.simple_quiz_app;

public class QuestionAndAnswer {
    public static String question[] ={
            "Which company owns the android?",
            "Which one is not a programming language?",
            "Which is the odd one?",
            "What is Android?",
            "Which programming language is primarily used for Android app development?",
            "What is an APK in Android?",
            "What is an activity in Android?",
            "Which XML-based language is used for designing Android layouts?",
            "What is the purpose of an Intent in Android?",
            "Which component is responsible for managing app navigation in Android?",
            "Which database option is commonly used for storing data in Android?",
            "What is the purpose of the AndroidManifest.xml file?",
            "Which layout manager is used to arrange elements in a grid-like structure in Android?",
            "What is the purpose of the Gradle build system in Android?",
            "What is the purpose of the findViewById() method in Android?",
            "What is the purpose of the ContentProvider class in Android?",
            "Which component is responsible for long-running operations in the background in Android?",
            "What is the purpose of the ActionBar in Android?",
            "What is the purpose of the SharedPreferences class in Android?",
            "Which tool is used for debugging Android apps?"


    };

    public static String choices[][] = {
            {"Google", "Apple", "Nokia", "Samsung"},
            {"Java", "Kotlin", "Notepad", "Python"},
            {"Facebook", "Whatsapp", "Instagram", "Youtube"},
            {"A programming language", "An operating system", "A device manufacturer","A software development too"},
            {"Java", "Python", "C++", "Swift"},
            {"Android Package Kit", "Android Play Store", "Android Software Development Kit", "Android Project File"},
            {"A graphical user interface", "A background service", "A database table", "A network request"},
            {"HTML", "XML", "CSS", "JSON"},
            {"To display error messages", "To communicate between components", "To handle user input", "To store app preferences"},
            {"Activity", "Fragment", "Intent", "Service"},
            {"MySQL", "SQLite", "MongoDB", "Oracle"},
            {"To define app permissions", "To store app resources", "To define app layout", "To manage app data"},
            {"LinearLayout", "RelativeLayout", "GridLayout", "FrameLayout"},
            {"To compile and build the Android app", "To manage project dependencies", "To generate APK files", "To handle UI rendering"},
            {"To inflate XML layouts", "To find views by their resource IDs", "To handle button clicks", "To launch new activities"},
            {"To manage app permissions", "To handle network requests", "To share data between apps", "To perform background tasks"},
            {"Activity", "Service", "BroadcastReceiver", "ContentProvider"},
            {"To display app notifications", "To handle user interactions", "To provide a consistent navigation experience", "To manage app data storage"},
            {"To store and retrieve key-value pairs", "To handle network requests", "To perform database operations", "To manage app permissions"},
            {"Android Studio", "Eclipse", "IntelliJ IDEA", "Visual Studio"}
    };

    public static String correctAnswers[]={
            "Google",
            "Notepad",
            "Youtube",
            "An operating system",
            "Java",
            "Android Package Kit",
            "A graphical user interface",
            "XML",
            "To communicate between components",
            "Activity",
            "SQLite",
            "To define app permissions",
            "GridLayout",
            "To manage project dependencies",
            "To find views by their resource IDs",
            "To share data between apps",
            "Service",
            "To provide a consistent navigation experience",
            "To store and retrieve key-value pairs",
            "Android Studio"
    };
}
