import java.util.Scanner;

public class reverse_number_loop {
    public static void main(String[] args) {
         System.out.println("Enter Your number : ");
         Scanner sc = new Scanner(System.in);

        for(int n = sc.nextInt() ; n>0 ; n = n/10){
            int l = n % 10;
            System.out.print(l + " ");
        }
    }
}
