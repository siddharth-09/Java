import java.util.Scanner;

public class function {

    // public static int printhelloworld(){
    //     System.out.println("Hello World");
    //     return 0;
    // }
    // public static void Calculatesum(int num1 , int num2){//Parameters or Formal parameters


    //         int sum = num1 + num2;

    //         System.out.println("Your sum is = " + sum);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     sc.close();
    //   Calculatesum(a , b);// aa je che ee Arguments che or actual parameters
      
    // }

    // function overloading using data types 

    // function to calculate int sum
    public static int sum(int a , int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));
    }
}
