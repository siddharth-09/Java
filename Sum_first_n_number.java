import java.util.Scanner;

public class Sum_first_n_number {
    public static void main(String[] args) {
        System.out.println("Enter Your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int sum = 0;
        while (a<=n) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
