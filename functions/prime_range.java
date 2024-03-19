package functions;

import java.util.Scanner;

public class prime_range {
//     //function how many number do you want to print

// static int num(int n){
//     for(int i = 1;i<=n;i++){
//         for(int j = 2;j<=n;j++){
//             if (n%j !=0) {
//                 System.out.println(n);
//             }
//         }
//     }
//     return 0;
// }


//     //main function
//     public static void main(String[] args) {
//         System.out.println("Enter a number how many prime do you want to print: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();

//        int a = num(n);
//        System.out.println(a);
//     }
// }


//function to check prime number
static boolean isPrime(int n){
    if(n == 2){
        return true;
    }
    else if(n == 1 || n ==0){
        return false;
    }
    for(int i = 2;i<=Math.sqrt(n);i++){
        if(n %i ==0){
            return false;
        }
    }
    return true;
}


//function to calculate how many prime are there in range
static void primeInRange(int n){
    for(int i = 2; i<=n;i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }

    }
    System.out.println();
}


//main function
public static void main(String[] args) {
    System.out.println("Enter a number to find the range of prime numbers in that");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    primeInRange(n);

}
}
