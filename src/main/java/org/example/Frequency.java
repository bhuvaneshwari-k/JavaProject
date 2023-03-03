package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Frequency {
    private Frequency(){
    }
    public static void countFrequency() {
        Logger l=Logger.getLogger("frequency.class");
        Scanner s=new Scanner(System.in);
        l.info("Enter the string:");
        String file=s.nextLine();
        String[] str=file.split(" ",9);
        HashMap<String,Integer> map=new HashMap<>();
        int size= str.length;
        int i=0;
        while(i<size){
            Integer freq=map.getOrDefault(str[i],0)+1;
            map.put(str[i],freq);
            i++;
        }
        PriorityQueue<Map.Entry<String,Integer>> pq= new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        l.log(Level.INFO,()->"The word and its frequency is:"+pq);
    }
}
