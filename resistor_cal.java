import java.util.Scanner;

public class resistor_cal {
    public static void main(String[] args) {
        double sum = 0, mult = 1, R=1;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many resistors in parallel");
        n = scanner.nextInt();
        
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of resistor");
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            sum = sum + ar[i];
            mult = mult * ar[i];
            R = (mult) / (sum);
        }
        System.out.println(R);
    }
}