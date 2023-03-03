package org.example;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Treeset {
    private Treeset(){

    }    public static void numberSet() {
        Scanner s = new Scanner(System.in);
        Logger l = Logger.getLogger("treeset.class");
        TreeSet<Integer> set = new TreeSet<>();
        int i=0;
        l.info("Enter size of the set:");
        int size=s.nextInt();
        l.info("Enter Numbers to Add:");
        while (i < size) {
            set.add(s.nextInt());
            i++;
        }
        l.log(Level.INFO,()-> "The number set is:"+set);
        l.log(Level.INFO, ()->"The size of the number set is:"+set.size());
        try {
            l.info("Enter number to remove:");
            set.remove(s.nextInt());
        }catch (NoSuchElementException e){
            e.getMessage();
        }
        l.log(Level.INFO,()-> "After remove the set is:"+set);
        l.info("Enter number to check:");
        if(set.contains(s.nextInt()))
            l.info("The number is present in the set");
        else
            l.info("The number is not present in the set");
        l.log(Level.INFO,()->"Lowest Value: "+set.pollFirst());
        l.log(Level.INFO,()->"Highest Value: "+set.pollLast());
        l.log(Level.INFO,()->"Head Set: "+set.headSet(35, true));
        l.log(Level.INFO,()->"SubSet: "+set.subSet(15, false, 35, true));
        l.log(Level.INFO,()->"TailSet: "+set.tailSet(30, false));
        l.log(Level.INFO,()->"Reverse Set: "+set.descendingSet());
        set.clear();
        l.log(Level.INFO,()->"After clearing the set: "+set);
        if(set.isEmpty())
            l.info("The set is empty");
        else
            l.info("The set is not empty" );

    }
}