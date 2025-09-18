package Vocaloid;

import java.sql.Date;
import java.util.LinkedList;
import java.util.Queue;

public class VocaloidQueueTest {
    public static void main(String[] args) {
        Queue<Vocaloid> stageQueue = new LinkedList<>();

        // Create Vocaloid instances
        Vocaloid miku = new Vocaloid("V1", "Hatsune Miku", "Crypton", Date.valueOf("2007-08-31"), "Saki Fujita");
        Vocaloid rin = new Vocaloid("V2", "Kagamine Rin", "Crypton", Date.valueOf("2007-12-27"), "Asami Shimoda");
        Vocaloid len = new Vocaloid("V3", "Kagamine Len", "Crypton", Date.valueOf("2007-12-27"), "Asami Shimoda");
        Vocaloid luka = new Vocaloid("V4", "Megurine Luka", "Crypton", Date.valueOf("2009-01-30"), "Yuu Asakawa");
        Vocaloid meiko = new Vocaloid("V5", "MEIKO", "Crypton", Date.valueOf("2004-11-05"), "Meiko Haigou");
        Vocaloid kaito = new Vocaloid("V6", "KAITO", "Crypton", Date.valueOf("2006-02-14"), "Naoto Fuga");

        // Add to queue (FIFO order)
        stageQueue.add(miku);
        stageQueue.add(rin);
        stageQueue.add(len);
        stageQueue.add(luka);
        stageQueue.add(meiko);
        stageQueue.add(kaito);
        lineSeparator();
        // Print all vocaloids in queue
        for (Vocaloid v : stageQueue) {
            System.out.println("[ALL] Introducing all vocaloids: " + v.getName());
        }
        lineSeparator();
        System.out.println("[INFO] Vocaloids waiting to perform (Queue size): " + stageQueue.size());

        // Peek: check who is next to perform
        System.out.println("[PEEK] Next on stage: " + stageQueue.peek().getName());

        // Poll: first in line performs and leaves
        Vocaloid performing = stageQueue.poll();
        System.out.println("[POLL] " + performing.getName() + " is performing and leaves the queue.");

        // Peek again
        System.out.println("[PEEK] Next on stage: " + stageQueue.peek().getName());

        // Process remaining performers
        while (!stageQueue.isEmpty()) {
            System.out.println("[NEXT] " + stageQueue.poll().getName() + " is performing now.");
        }

        // Check if empty
        if (stageQueue.isEmpty()) {
            System.out.println("[DONE] All Vocaloids have performed. The stage is empty.");
        }
    }
    
    public static void lineSeparator() {
        System.out.println("-------------------------------------------------------------------");
    }
}
