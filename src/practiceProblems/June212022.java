package practiceProblems;

import java.util.HashMap;
import java.util.Map;

public class June212022 {

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        int k =4;

        findDistintCountInEachWindow(arr,k);
    }

    private static void findDistintCountInEachWindow(int[] arr, int k) {

       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0;i<k;i++){
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
       }
        /**
         * Now the size of the map will get me the total
         * num of distint elements in first k element window
         */
        System.out.println(map.size());

        /**
         * We need to keep sliding the window now by 1 unit
         */
        for(int i=k ;i<arr.length;i++){
            /**
             * We need to remove the arr[i-k] element now
             * and add teh kth element into the map
             */

            //Removing the arr[i-k] element
            if(map.get(arr[i-k])==1){
                //remove the arr[i-k] element
                map.remove(arr[i-k]);
            }else{
                //reduce the count by 1, if it's more than 1
                map.put(arr[i-k] , map.get(arr[i-k])-1);
            }

            //Inserting the ith element
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

            System.out.println(map.size());

        }


    }
}
