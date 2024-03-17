import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter your digit : ");
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();

        if(A % 2 ==0 )
        {
            System.out.println(A+" IS EVEN");
        }
        else
        {
            System.out.println(A+" IS ODD");
        }
    }
}
