import java.util.Scanner;

public class Income_tax {
    public static void main(String[] args) {
        System.out.println("Enter Your Income(in Lakhs): ");
        Scanner sc = new Scanner(System.in);
        double I = sc.nextDouble();

        if(I<5){
            System.out.println("Your income tax is 0%");
        }
        else if(I>5 && I<10)
        {
            double tax = (I*0.2);
            System.out.println("Your income tax is " +tax);

        }
        else{
            double tax = I*0.3;
            System.out.println("Your tax is : "+tax+"L");

        }
    }
}
