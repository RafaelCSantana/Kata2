package kata2;

import java.util.Map;

public class Kata2 {
     public static void main(String [] arg) {
       
         String [] data = {"pepe", "juan", "carlos", "juan", "pepe"};
         Histogram his = new Histogram(data);
         Map<String, Integer> histogram = his.getHistogram();
        
         for(String key: histogram.keySet()){
            System.out.println(key + "==>" + histogram.get(key));
        }
    }     
}