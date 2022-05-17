package sorting;

import ll.ListNode;

public class May17 {

    public static ListNode newHead ;
    public static ListNode insertionSortLL( ListNode head){

        if(head == null || head.getNext() ==null){
            return head ;
        }

        ListNode current = head ;


        while(current!=null){
            ListNode next  = current.getNext();
            insertAtRightPlace(current);
            current=next;
        }

        head = newHead;
        return head ;
    }


    public void arrange(int[] arr){
        int i=0;
        int j= arr.length-1;

        while(i<j){
            while(arr[i]==0){
                i++;
            }

            // i will represent 1

            while(arr[j]==1){
                j--;
            }
            //j will represent 0

            if(i<j){
                //swap i and j
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }


    public boolean canBeSorted(int[] arr , boolean[] b){

        for(int i = arr.length-1;i>=0;i--){


            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    //I need to do the swapping
                    if(!b[j]){
                        //Can't do the swapping
                        return false;
                    }else{
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }

        return true;
    }

    private static void insertAtRightPlace(ListNode current) {

        if(newHead ==null || newHead.getData()>= current.getData()){
            current.setNext(newHead);
            newHead = current;
        }else{
            ListNode temp = newHead;
            while(temp.getNext()!=null && temp.getNext().getData()<current.getData()){
                temp = temp.getNext();
            }
            current.setNext(temp.getNext());
            temp.setNext(current);
        }

    }
}
