import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("Enter a number for multiplication table ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int mult;
        for(int i = 1; i<=10;i++)
        {
            mult = i * num;
            System.out.println(num + "x" + i + "="+ mult);
        }
    }
}
