package recursion;

public class Test {


    public static void fun(int x){
        if(x>0){
            fun(--x);
            System.out.print(x+" ");
            fun(x--);
        }
    }

    public static void main(String[] args) {
        fun(4);
    }
}
