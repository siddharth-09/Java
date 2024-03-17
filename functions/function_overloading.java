package functions;

public class function_overloading {

    //function to calculate sum of two numbers
    public static int sum(int a , int b){
        return a +b;
    }

    // function to calculate sum of three numbers
    public static int sum (float a , float b){
        System.out.println(a+b);

        // a+b;
        return 0;
    }
    
    public static void main(String[] args) {
        sum(2, 3.3f);

        // int a = sum(2, 3.3f);
        // System.out.println(a);
    }
}
