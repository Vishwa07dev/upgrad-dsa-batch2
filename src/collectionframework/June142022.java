package collectionframework;

import java.util.Hashtable;
import java.util.Map;

public class June142022 {

    public static void main(String[] args) {
        /**
         * Initializing hashtable
         */
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        /**
         * Create a bucket of size 8
         */
        Hashtable<String, Integer> hashtable1 = new Hashtable<>(32);


        Hashtable<String, Integer> hashtable2 = new Hashtable<>(32,0.9f);

        /**
         * Inserting the element in the Hashtable
         */
        hashtable.put("Vishwa",50000);

        hashtable.put("Vishwa",60000);   // Value is overridden modification

        //hashtable.put(null, 5000);  // Null can't be used as a key
        //hashtable.put("Vishwa", null); // Null can't be used a value

        hashtable.put("Mohan", 10000);
        hashtable.put("Shivani", 100000);
        hashtable.put("Akshay", 1000000);
        System.out.println(hashtable);


        /**
         * Iterate over the hashtable
         */

        /**
         * Iterate over the keys
         */
        for(String key : hashtable.keySet()){
            System.out.println(key);
            //hashtable.remove(key); // We can't remove while iterating the Hashtable
        }

        for(Integer value : hashtable.values()){
            System.out.println(value);
        }

        for(Map.Entry<String,Integer> entry : hashtable.entrySet()){
            System.out.println(entry);
        }

        /**
         * How we check if a key is present in the HashTable
         */
        System.out.println(hashtable.containsKey("Vishwa"));
        System.out.println(hashtable.containsKey("Ayon"));

        /**
         * We want to check if the value is present
         */
        System.out.println(hashtable.contains(10000));


        /**
         * Remove a key from the Hashtable
         */
        hashtable.remove("Vishwa");

        System.out.println(hashtable);

        /**
         * Getting value based on the key
         */

        System.out.println(hashtable.get("Mohan"));
        System.out.println(hashtable.get("Vishwa"));





    }
}
