package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {
    private final int[] data;
    
    public HistogramGenerator(int[] data) {
        this.data = data;
    }
    
    Map<Integer,Integer> getHistogram() {
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for(int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i)+1 : 1);
        }
        return histogram;
    }
}
