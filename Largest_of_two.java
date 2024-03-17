import java.util.Scanner;

public class Largest_of_two {
    public static void main(String[] args) {
        //code to find out which number is largest from user
        System.out.println("Enter your first digit : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println("Enter your Second digit : ");
        int B = sc.nextInt();

        if(A>B){
            System.out.println(A +" is Greater than " + B);
        }
        else if(A==B){
            System.out.println(A +" is Equal than " + B);
        }
        else{
            System.out.println(B +" is Greater than " + A);
        }
    }
}
