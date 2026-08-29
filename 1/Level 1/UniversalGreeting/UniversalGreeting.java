public class UniversalGreeting {
    public static String greeting(String language) {
       switch (language) {
           case "FR":return "Bonjour comment allez-vous?";
           case "EN": return "Hello, How are you?";
           case "ES": return "Hola, cómo estás?";
           default: return "";
               
       }
    }
}
