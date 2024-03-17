import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        //code to print largest of three number
        System.out.println("Enter First digit: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second digit: ");
        int b = sc.nextInt();
        
        System.out.println("Enter Third digit: ");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is greater");
        }
        else if(b>=c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
    
    }
}
