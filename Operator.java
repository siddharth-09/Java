import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        
        System.out.println("Enter Second number");
        float b = sc.nextFloat();

        float add,minus,multiply,division,modulo;

        add = a+b;
        minus = a-b;
        multiply = a*b;
        division = a/b;
        modulo = a%b;

        System.out.println("Your addition is "+add);
        System.out.println("Your addition is "+minus);
        System.out.println("Your addition is "+multiply);
        System.out.println("Your addition is "+division);
        System.out.println("Your addition is "+modulo);
    }
    
}
