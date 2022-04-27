import java.util.HashMap;

public class Main {
    static HashMap<String, String> languageMap;

    public static void main(String[] args) {

        Student student1 = new Student("Michael", "Fessler", 42069);
        Student student2 = new Student("Hannah", "Roswig", 69696);

        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();

        hashMap.put(student1.getMatrikelNr(), student1);
        hashMap.put(student2.getMatrikelNr(), student2);

        System.out.println(hashMap.toString());

        System.out.println();

        Student student3 = new Student("Sabrina", "Maerch", 69696);

        hashMap.put(student3.getMatrikelNr(), student3);

        System.out.println(hashMap.toString());

        System.out.println("-------------------------------------------------");

        System.out.println("Start");
        System.out.println("Language");
        System.out.println("Exit");

        System.out.println();

        HashMap<String, String> english = new HashMap<String, String>();
        english.put("mstart", "Start");
        english.put("mlanguage", "Language");
        english.put("mexit", "Exit");

        HashMap<String, String> german = new HashMap<String, String>();
        german.put("mstart", "Starten");
        german.put("mlanguage", "Sprache");
        german.put("mexit", "Beenden");

        languageMap = german;

        System.out.println(languageMap.get("mstart"));
        System.out.println(languageMap.get("mlanguage"));
        System.out.println(languageMap.get("mexit"));

        System.out.println();

        languageMap = english;

        System.out.println(languageMap.get("mstart"));
        System.out.println(languageMap.get("mlanguage"));
        System.out.println(languageMap.get("mexit"));
    }
}