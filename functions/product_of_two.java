package functions;

import java.util.Scanner;

public class product_of_two {
    
        public static void product(int a , int b){
            int p = a * b;
            System.out.println("The product is " +p);
        }

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a, b);
    }

}
