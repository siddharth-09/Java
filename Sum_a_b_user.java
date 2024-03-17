import java.util.*;

public class Sum_a_b_user {
    
    public static void main(String[] args) {
        //code to sum a and b from user
        System.out.println("Enter Your first Digit");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Your Second Digit");

        //Scanner sc2 = new Scanner(System.in); We can use only one Scanner for multiple inputs
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);

    }
}
