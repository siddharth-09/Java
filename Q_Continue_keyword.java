import java.util.Scanner;

public class Q_Continue_keyword {
    public static void main(String[] args) {
        do {
            System.out.print("Enter your number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
