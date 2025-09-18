package Vocaloid;

import java.sql.Date;
import java.util.Stack;

public class VocaloidStackTest {
    public static void main(String[] args) {
        Stack<Vocaloid> stageStack = new Stack<>();

        // Create Vocaloid instances
        Vocaloid miku = new Vocaloid("V1", "Hatsune Miku", "Crypton", Date.valueOf("2007-08-31"), "Saki Fujita");
        Vocaloid rin = new Vocaloid("V2", "Kagamine Rin", "Crypton", Date.valueOf("2007-12-27"), "Asami Shimoda");
        Vocaloid len = new Vocaloid("V3", "Kagamine Len", "Crypton", Date.valueOf("2007-12-27"), "Asami Shimoda");
        Vocaloid luka = new Vocaloid("V4", "Megurine Luka", "Crypton", Date.valueOf("2009-01-30"), "Yuu Asakawa");
        Vocaloid MEIKO = new Vocaloid("V5", "MEIKO", "Crypton", Date.valueOf("2004-11-05"), "Meiko Haigou");
        Vocaloid KAITO = new Vocaloid("V6", "KAITO", "Crypton", Date.valueOf("2006-02-14"), "Naoto Fūga");

        // Push: add to stack
        stageStack.push(miku);
        stageStack.push(rin);
        stageStack.push(len);
        stageStack.push(luka);
        stageStack.push(KAITO);
        stageStack.push(MEIKO);
        

        System.out.println("[INFO] Vocaloids waiting to perform (Stack size): " + stageStack.size());

        // Peek: who’s on stage now?
        System.out.println("[PEEK] Currently on stage: " + stageStack.peek().getName());

        // Pop: someone finishes and leaves the stage
        Vocaloid finished = stageStack.pop();
        System.out.println("[POP ] " + finished.getName() + " has finished performing.");

        // Peek again
        System.out.println("[PEEK] Now on stage: " + stageStack.peek().getName());

        // Empty the stack
        while (!stageStack.isEmpty()) {
            System.out.println("[NEXT] " + stageStack.pop().getName() + " is now performing.");
        }

        // Check if empty
        if (stageStack.isEmpty()) {
            System.out.println("[DONE] All Vocaloids have performed. The stage is empty.");
        }
    }
}
