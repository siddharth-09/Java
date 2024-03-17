import java.util.*;

public class product_ab {
    public static void main(String[] args) {
        
        System.out.println("Enter you First Digit");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter Your Second Digit");
        double b = sc.nextDouble();
        double product = a*b;
        System.out.println("Your Product of "+ a + " And " +b +" is "+ product);
    }
}
