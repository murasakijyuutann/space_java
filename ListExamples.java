import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ListExamples {
    public static void main(String[] args) {

        // === ArrayList Example ===
        List<String> vocaloids = new ArrayList<>();
        vocaloids.add("Hatsune Miku");
        vocaloids.add("Megurine Luka");
        vocaloids.add("Kagamine Rin");
        vocaloids.add("Kagamine Len");
        vocaloids.add("MEIKO");
        vocaloids.add("KAITO");
        clearLine();
        System.out.println("ArrayList (Vocaloids):");
        for (String name : vocaloids) {
            System.out.println("- " + name);
        }

        clearLine();

        // === LinkedList Example ===
        List<String> todoList = new LinkedList<>();
        todoList.add("Practice Java");
        todoList.add("Build payment system");
        todoList.add("Test database");

        System.out.println("\nLinkedList (Todo List):");
        for (String string : todoList) {
            System.out.println("Things that require your attention are following: " + string);
        }

        clearLine();

        // === HashMap Example ===
        HashMap<String, Integer> vocaloidAges = new HashMap<>();
        vocaloidAges.put("Hatsune Miku", 16);
        vocaloidAges.put("Megurine Luka", 19);
        vocaloidAges.put("Kagamine Rin", 14);
        vocaloidAges.put("Kagamine Len", 14);
        vocaloidAges.put("MEIKO", 24);
        vocaloidAges.put("KAITO", 23);

        System.out.println("\nHashMap (Vocaloid Ages):");
        for (String name : vocaloidAges.keySet()) {
            System.out.println(name + " is " + vocaloidAges.get(name) + " years old");
        }

        clearLine();

        // === LinkedHashMap Example ===
        LinkedHashMap<String, String> issueTaxFileNumber = new LinkedHashMap<>();
        issueTaxFileNumber.put("TFN000000001", "Anthony Powell");
        issueTaxFileNumber.put("TFN000000002", "Sakamoto Ryuji");
        issueTaxFileNumber.put("TFN000000003", "Morimoto Haruka");
        issueTaxFileNumber.put("TFN000000004", "Satou Tsumugi");
        issueTaxFileNumber.put("TFN000000005", "Yoshimoto Mizuki"); // ← 半角セミコロン


        System.out.println("\nLinkedHashMap :");
        for (String txnId : issueTaxFileNumber.keySet()) {
            System.out.println(txnId + " has been successfully issued to: " + issueTaxFileNumber.get(txnId));
        }

        clearLine();
    }

    public static void clearLine() {
        System.out.println("--------------------------------------------------------------------------");
    }
}
