package HashSet;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> setExample = new HashSet<>();
        setExample.add("Apple");
        setExample.add("Banana");
        setExample.add("Orange");
        setExample.add("Apple"); // Duplicate entry
        lineSeparator();
        System.out.println(setExample);
        lineSeparator();
    }
    
     public static void lineSeparator(){
        System.out.println("-------------------------------------------------------------------");
    }
    
}
