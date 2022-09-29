package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(2,32);
        map.put(7,42);
        map.put(32,104);
        map.put(5,25);
        map.put(0,2);
        
        Iterator<Map.Entry<Integer,Integer>> iteratorEntries = map.entrySet().iterator();
        
        while(iteratorEntries.hasNext()) {
            Map.Entry<Integer,Integer> entry = iteratorEntries.next();
            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }

        System.out.println("------------");

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }
        
        System.out.println("------------");
        
        for(Integer key : map.keySet()) {
            System.out.println("Key = "+key+", Value = "+map.get(key));     // Menos eficiente, más accesos al mapa       
        }
                
        System.out.println("------------");
        
        for(Integer value : map.values()) {
            System.out.println("Value = "+value);     // Menos eficiente, más accesos al mapa       
        }
        
        System.out.println("------------");
        
        // Histograma
        int[] array = {15,4,4,3,78,4,2,2,2,2,65,4,2,-1,2};
        
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for(int i : array) {
            if(histogram.containsKey(i)) {
                histogram.put(i, histogram.get(i)+1);
            } else {
                histogram.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }
    }
    
}
