package Vocaloid;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class VocaloidTest {
    public static void main(String[] args) {
        VocaloidDAO dao = new VocaloidDAO();

        // Create some Vocaloid instances
        Vocaloid v1 = new Vocaloid("1", "Hatsune Miku", "Crypton Future Media", java.sql.Date.valueOf("2007-08-31"),
                "Saki Fujita");
        Vocaloid v2 = new Vocaloid("2", "Kagamine Rin", "Crypton Future Media", java.sql.Date.valueOf("2007-12-27"),
                "Asami Shimoda");
        Vocaloid v3 = new Vocaloid("3", "Megurine Luka", "Crypton Future Media", java.sql.Date.valueOf("2009-01-30"),
                "Yuu Asakawa");
        Vocaloid v4 = new Vocaloid("4", "GUMI", "Internet Co., Ltd.", java.sql.Date.valueOf("2009-06-26"),
                "Megumi Nakajima");

        // Add Vocaloids to DAO
        dao.addVocaloid(v1);
        dao.addVocaloid(v2);
        dao.addVocaloid(v3);
        dao.addVocaloid(v4);
        lineSeparator();
        // Retrieve and print all Vocaloids
        System.out.println("All Vocaloids:");
        for (Vocaloid v : dao.getAllVocaloids()) {
            System.out.println(v);
        }
        lineSeparator();
        // Retrieve and print a specific Vocaloid by ID
        System.out.println("\nVocaloid with ID 2:");
        System.out.println(dao.getVocaloidById("2"));

        // Retrieve and print Vocaloids by manufacturer
        System.out.println("\nVocaloids by Crypton Future Media:");
        for (Vocaloid v : dao.getVocaloidsByManufacturer("Crypton Future Media")) {
            System.out.println(v);
        }
        lineSeparator();
        // Remove a Vocaloid by ID
        System.out.println("\nRemoving Vocaloid with ID 3:");
        dao.removeVocaloidById("3");
        lineSeparator();
        // Print all Vocaloids after removal
        System.out.println("\nAll Vocaloids after removal:");
        for (Vocaloid v : dao.getAllVocaloids()) {
            System.out.println(v);
        }
        lineSeparator();
        // Iterate through Vocaloids using iterator
        System.out.println("\nIterating through Vocaloids:");
        Iterator<Vocaloid> iterator = dao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        lineSeparator();
    }

    public static void lineSeparator() {
        System.out.println("-------------------------------------------------------------------");
    }
    
    
}
