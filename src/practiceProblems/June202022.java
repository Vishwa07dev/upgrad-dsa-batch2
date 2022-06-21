package practiceProblems;

import ll.ListNode;

import java.util.HashSet;
import java.util.Set;

public class June202022 {

    public static void printAlternate(ListNode head){

        if(head ==null){
            return;
        }

        while(head!=null){
            System.out.print(head.getData());

            head = head.getNext();
            if(head==null){
                return;
            }
            head= head.getNext();
        }

    }

    public void printAlternaterec(ListNode head){
        //Base condition
        if(head ==null){
            return;
        }
        System.out.println(head.getData());

        head = head.getNext();
        if(head!=null){
            head = head.getNext();
        }
        printAlternaterec(head);
    }


    public void printAlt(ListNode head , boolean isEven){
        if(head==null){
            return;
        }
        if(isEven){
            System.out.println(head.getData());
        }
        printAlt(head.getNext(),!isEven);
    }


    public static void main(String[] args) {
        int[] small = {11,3,7,1};
        int[] large = {11,1,13,21,3,7};

        System.out.println(isSmallSubsetOfLarge(small,large));
    }

    private static boolean isSmallSubsetOfLarge(int[] small, int[] large) {

        Set<Integer> set = new HashSet<>();

        for(int ele : large){
            set.add(ele);
        }

        for(int ele : small){
            if(!set.contains(ele)){
                return  false;
            }
        }
        return true;
    }




}
