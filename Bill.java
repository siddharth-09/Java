import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        System.out.println("Enter the price of pen");
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();

        System.out.println("Enter the price of pencil");
        float p = sc.nextFloat();

        System.out.println("Enter the price of Eraser");
        float E = sc.nextFloat();

        float cost = (pen+(pen*0.18f)) + (p+(p*0.18f)) + (E+(E*0.18f)) ;

        System.out.println("The total bill of three product is "+cost);
        
    }
    
}
