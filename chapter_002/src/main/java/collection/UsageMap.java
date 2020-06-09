package collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String > map = new HashMap<>();
        map.put("123@ukr.net", "Lashchenko Vitaly");
        map.put("124@ukr.net", "Lashchenko Oksana");
        map.put("125@ukr.net", "Lashchenko Maksim");
        for (String key: map.keySet()
             ) {
            String value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }

}
