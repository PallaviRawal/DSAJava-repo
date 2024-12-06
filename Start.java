package Java;

import java.util.*;
public class Start {
    public static String getstart(HashMap<String,String>tickets){
        HashMap<String,String>revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        
        }
        
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
                }
        }
        return null;
    }
        
    public static void main(String[] args){
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String startplace=getstart(tickets);
        while(tickets.containsKey(startplace)){
            System.out.println(startplace);
            startplace=tickets.get(startplace);
        }
        System.out.println(startplace);

        
    }
    
}
