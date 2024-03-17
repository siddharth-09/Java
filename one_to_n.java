import java.util.Scanner;

public class one_to_n {
    public static void main(String[] args) {
        System.out.println("Enter Your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;

        while (a<=n) 
        {
            System.out.print(a + " ");
            a++;
            
        }
    }
}
