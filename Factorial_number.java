import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int count = 1;count<=num; count++)
        {
            fact = fact * count;

        }
        System.out.print(num +"!= "+fact);
    }
}
