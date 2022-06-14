package stacks;

import java.util.Stack;

public class June132022 {


    public static void main(String[] args) {
        int[][] mangoes  = {
                {2,1,0,2,1},
                {1,0,1,2,1},
                {1,0,0,2,1}
        };

        System.out.println(daysToRotMangoes(mangoes));




        boolean[][] relationMatrix = {
                {false, false, true, false},
                {false, false, true, false},
                {false, false, false, false},
                {false, false, true, false}
        };

        System.out.println(findCelebrity(4,relationMatrix));
    }

    private static int daysToRotMangoes(int[][] mangoes) {
        int days = 0;
        int rotNum = 2;
        while(true){
            boolean anyMangoWasRotten = false;
            for(int i=0;i<mangoes.length;i++){
                for(int j=0;j<mangoes[0].length;j++){

                    if(mangoes[i][j]==rotNum){
                        // top
                        if(i-1>=0 && mangoes[i-1][j] == 1){
                            mangoes[i-1][j]=rotNum+1;
                            anyMangoWasRotten=true;
                        }
                        //left
                        if(j-1>=0 && mangoes[i][j-1] == 1){
                            mangoes[i][j-1]=rotNum+1;
                            anyMangoWasRotten=true;
                        }
                        //right
                        if(j+1<mangoes[0].length&& mangoes[i][j+1] == 1){
                            mangoes[i][j+1]=rotNum+1;
                            anyMangoWasRotten=true;
                        }
                        //down
                        if(i+1<mangoes.length && mangoes[i+1][j] == 1){
                            mangoes[i+1][j]=rotNum+1;
                            anyMangoWasRotten=true;
                        }
                    }
                }
            }
            if(!anyMangoWasRotten){
                break;
            }

            days++;

        }
        return days;
    }

    private static int findCelebrity(int n, boolean[][] relationMatrix) {

       Stack<Integer> stack = new Stack<>();

       for(int i=0;i<n;i++){
           stack.push(i);
       }

       while(stack.size()>1){ //till has 2 or more elements
           int per1 = stack.pop();
           int per2 = stack.pop();

           if(relationMatrix[per1][per2]){
               //per1 is not the celebrity
               stack.push(per2);
           }else{
               //per2 is not the celebrity
               stack.push(per1);
           }
       }

        /**
         * I will be left with one element, which can be celebrity
         *
         */

        int celeb = stack.pop();

        //Need to verify if celeb is actually the celebrity

        for(int i=0;i<n;i++){
            if(i!=celeb && !(relationMatrix[i][celeb] && !relationMatrix[celeb][i])){
                return -1 ; // there is no celebrity
            }
        }

        return celeb;


    }
}
