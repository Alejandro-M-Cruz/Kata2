package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        // Histograma
        int[] data = {15,4,4,3,78,4,2,2,2,2,65,4,2,-1,2};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        
        for(Map.Entry<Integer, Integer> entry : histogramGenerator.getHistogram().entrySet()) {
            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }
    }
    
}
