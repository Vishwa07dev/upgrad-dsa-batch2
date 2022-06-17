package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class June172022 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // 16 default no of buckets

        HashMap<String, Integer> map1 = new HashMap<>(32);


        HashMap<String, Integer> map2 = new HashMap<>(32, 0.9f);
        /**
         * Insert data
         */
        map.put("Vishwa", 50000);
        map.put("Mohan", 40000);
        map.put("Akash", 500000);
        map.put("Vivek", 150000);
        map.put("Akhil", 510000);

        System.out.println(map);

        /**
         * How can we search for a key
         */

        System.out.println(map.get("Vishwa"));
        System.out.println(map.get("Ayon"));


        /**
         * Checking if the key is present
         */

        System.out.println(map.containsKey("Vishwa"));
        System.out.println(map.containsKey("Ayon"));

        /**
         * Iteration in the case of HashMap
         */
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> "+entry.getValue());
        }

        for(String key : map.keySet()){
            System.out.println(key);
        }

        for(Integer value : map.values()){
            System.out.println(value);
        }


    }
}
