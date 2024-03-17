import java.util.Scanner;

public class Sqaure_pattern {
    public static void main(String[] args) {
        /* pattern :
         *          
         *          * * * *
         *          * * * *
         *          * * * *
         */

         System.out.println("Enter how many pattern to print : ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        for(int i = 1;i<=l;i++){
            System.out.println("* * * *");

        }
    }
}
