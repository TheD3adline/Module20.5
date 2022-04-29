import java.util.HashMap;

public class Main {
    static HashMap<String, String> languageMap;  //Then a new HashMap with the same key/storage type combination is declared, but as static

    public static void main(String[] args) {                //HashMap is an extremely important data structure. It assigns data points to custom keys, keys can be of any type of Object, so no primitive data types, only complex ones

        Student student1 = new Student("Michael", "Fessler", 42069);
        Student student2 = new Student("Hannah", "Roswig", 69696);

        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>(); //Here the HashMap is initialized, it is set up to expect an Integer as the key element and Student as the stored data type

        hashMap.put(student1.getMatrikelNr(), student1);                    //.put to add content to the structure, matrikelNr of Student.java is being used as Integer for the key, then the object itself is stored
        hashMap.put(student2.getMatrikelNr(), student2);

        System.out.println(hashMap.toString());                             //Overwritten .toString() method of Student.java accesses the contents of Student1 and Student2 via the hashMap variable

        System.out.println();

        Student student3 = new Student("Sabrina", "Maerch", 69696);         //.put a new Object into the storage onto the very same key overwrites the existing content of the key

        hashMap.put(student3.getMatrikelNr(), student3);

        System.out.println(hashMap.toString());

        System.out.println("-------------------------------------------------");

        System.out.println("Start");                                //HashMap can be utilized so a UI supports different languages without having to write tons of code
        System.out.println("Language");
        System.out.println("Exit");

        System.out.println();

        HashMap<String, String> english = new HashMap<String, String>();    //Here a new HashMap is being initialized, with a key of the String type and content also of the String type
        english.put("mstart", "Start");                                     //We .put the different words for the supported UI languages to their respective keys
        english.put("mlanguage", "Language");
        english.put("mexit", "Exit");

        HashMap<String, String> german = new HashMap<String, String>();     //Same for the other supported languages(s)
        german.put("mstart", "Starten");
        german.put("mlanguage", "Sprache");
        german.put("mexit", "Beenden");

        languageMap = german;                                               //Now we allocate the german HashMap with the language data to languageMap Hashmap

        System.out.println(languageMap.get("mstart"));                      //Now with the .get method of languageMap and the respective keys in () we can access the stored String data
        System.out.println(languageMap.get("mlanguage"));
        System.out.println(languageMap.get("mexit"));

        System.out.println();

        languageMap = english;                                              //That allows us to change the language of for example a UI with only 1 line of code

        System.out.println(languageMap.get("mstart"));
        System.out.println(languageMap.get("mlanguage"));
        System.out.println(languageMap.get("mexit"));
    }
}