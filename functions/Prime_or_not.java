package functions;

import java.util.Scanner;

public class Prime_or_not {
    // galat hatu maru logic
    // //function to check the number is prime or not
    // public static int isPrime(int a){
    // if(a%2 != 0 || a == 2){
    // System.out.println(a +"Number is Prime");
    // }
    // else{
    // System.out.println(a +" Number is not prime");
    // }
    // return 0;
    // }

    // // the main class
    // public static void main(String args[]){
    // System.out.println("Enter a number to check it is Prime or not");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // sc.close();
    // System.out.println(isPrime(a));
    // }

    
    // ave khabar padi su karavanu che chal jo

    // function to calculate prime or not
    // this is for n>=2
    public static boolean isPrime(int n) {
        // boolean isPrime = true; agar aa na lakhiye to bhi clase

        // corner case
        // for 2
        if (n == 2) // checking for 2 only
        {
            return true;
        } 
        else if (n >= 2) // greater than 2
        {
            for (int i = 2; i <= Math.sqrt(n); i++) {// loop to check which number will completly divide the 'n' number
                if (n % i == 0) {// completly divide thay toh ee number prime nathi
                    // isPrime = false;
                    // break; no need for this we can directly write that return false when
                    // condition is true
                    return false;
                }
            }
        }
        else{// for 1 and 0 or other cases if there
            return false;
        }
        // return isPrime; direct return true lakhi devanu
        return true;
    }

    // creating a main class
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }

}
