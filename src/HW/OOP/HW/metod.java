package HW.OOP.HW;

import java.util.HashMap;
import java.util.Map;

public class metod {
    public static Map<String, Integer> reversMap(Map<Integer, String> o){
        Map<String, Integer> reversMap = new HashMap<>();
        for (int i = 0; i < o.size(); i++) {
            for (Map.Entry<Integer, String> change : o.entrySet()) {
                reversMap.put(change.getValue(), change.getKey());
            }
        }
        return reversMap;
    }
}
