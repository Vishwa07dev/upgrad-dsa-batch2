package practiceProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class June222022 {


    public static void findSymmPair(int[][] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int second = arr[i][1];
            /**
             * I need to go and check second in the map
             */
            if(map.get(second)!=null && map.get(second)==first){
                System.out.println("( "+first + " , "+ second +" )");
            }else{
                map.put(first,second);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1,9,8,0,5,8,1,3,0,4};

        sort(arr);

        System.out.println(Arrays.toString(arr)); // It should print in sorted order
    }

    private static void sort(int[] arr) {

        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int[] count = new int[largest+1];

        for(int i=0;i<arr.length;i++){
            //count[arr[i]] = count[arr[i]]+1;
            ++count[arr[i]];
        }

         for(int i=1;i<count.length;i++){
            //count[i] = count[i]+count[i-1];
            count[i] +=count[i-1];
        }

        int[] temp = new int[arr.length]; // same size as the original array

        for(int i= arr.length-1;i>=0;i--){
            temp[count[arr[i]]-1] = arr[i];
            //count[arr[i]] = count[arr[i]] -1 ;
            --count[arr[i]];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }


    }
}


class Stacks {
    private int[] arr ;
    private int capacity;
    int top1,top2 ; // top1 will be used for stack1 and top2 will be used for stack2

    public Stacks(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];

        int mid = capacity/2;
        top1 = mid;
        top2=mid+1;
    }

    public void push1(int data){
        if(isFullStack1()){
            throw new RuntimeException("Stack overflow");
        }
        this.arr[top1--] = data;
    }

    public int pop1(){
        if(isEmptyStack1()){
            throw new RuntimeException("Stack underflow");
        }
        int data = this.arr[++top1];
        return data ;
    }

    private boolean isEmptyStack1() {
        return top1==this.capacity/2;
    }

    public boolean isFullStack1(){
       return top1==0;
    }

}
