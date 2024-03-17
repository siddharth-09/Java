import java.util.Scanner;

public class multiple_of_10 {
    public static void main(String[] args) {
        do {
            System.out.print("Enter your given number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n %10==0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
