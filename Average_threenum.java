import java.util.Scanner;

public class Average_threenum {

    public static void main(String[] args) {
//code Inaprogram,input3numbers and find avg
        System.out.println("Enter Your first Number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Enter Your Second Number");
        double b = sc.nextDouble();

        System.out.println("Enter Your Third Number");
        double c = sc.nextDouble();

        double avg = (a+b+c)/3;

        System.out.println(avg);

        

    }
    
}
