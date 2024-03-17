import java.util.Scanner;

public class Area_of_Sqaure{

    public static void main(String[] args) {
        //code to calculate area of square and input from user
        System.out.println("Enter the side of Square:");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double area = s*s;
        System.out.println("Area of Square is "+area);
    }
}