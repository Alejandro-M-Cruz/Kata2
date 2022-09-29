package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    private final T[] data;
    
    public HistogramGenerator(T[] data) {
        this.data = data;
    }
    
    Map<T,Integer> getHistogram() {
        Map<T,Integer> histogram = new HashMap<T,Integer>();
        for(T i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i)+1 : 1);
        }
        return histogram;
    }
}
