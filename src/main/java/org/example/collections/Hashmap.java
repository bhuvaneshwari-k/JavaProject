package org.example.collections;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap{
   private Hashmap(){
    }
    public static void employeeList(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Logger l = Logger.getLogger("hashmap.class");
        HashMap<Integer,String> map=new HashMap<>();
        int i=0;
        l.info("Enter size of the list:");
        int size=s.nextInt();
        int[] id=new int[size];
        String[] name=new String[size];
        try {
            while (i < size) {
                l.info("Enter Employees id to Add:");
                id[i] = s.nextInt();
                l.info("Enter Employees name to Add:");
                name[i] = s1.nextLine();
                map.put(id[i], name[i]);
                i++;
            }
        }catch (InputMismatchException e){
            l.log(Level.INFO,()->"Invalid Input"+e.getMessage());
        }
        l.log(Level.INFO,()-> "The Employees id and name are:"+map);
        map.putIfAbsent(103, "jeeva");
        l.log(Level.INFO,()-> "The updated Employee list:"+map);
        map.remove(104);
        l.log(Level.INFO,()-> "The Employee list after remove based on key:"+map);
        map.remove(102, "sangee");
        l.log(Level.INFO, ()->"The Employee list after remove:"+map);
        map.replace(103, "monsi");
        l.log(Level.INFO, ()->"The Employee list after replacing:"+map);
        map.replace(101, "bhuvana", "vijay");
        l.log(Level.INFO, ()->"The Employee list after replacing the value:"+map);
        HashMap<Integer,String> map1=new HashMap<>();
        map.put(105,"latha");
        map1.putAll(map);
        l.log(Level.INFO,()-> "The new Employee list:"+map1);
        map1.replaceAll((k,v) -> "jothi");
        l.log(Level.INFO, ()-> "The Employee list after replacing all the values:"+map1);
        map1.clear();
        l.log(Level.INFO,()-> "The Employee list after clear:"+map1);
        if(map1.isEmpty()){
            l.info("The Employee list is Empty");
        }else
        {
            l.info("The Employee list is not Empty");
        }
    }
}
