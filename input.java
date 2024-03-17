import java.util.Scanner;

public class input 
{
    public static void main(String[] args) 
    {
        //code to get input from user
        System.out.println("Enter your name");
        Scanner scanf = new Scanner(System.in);
        String input = scanf.nextLine();//only next is for word
        System.out.println("Your name is "+input);

        Scanner name = new Scanner(System.in);
        int num = name.nextInt();// only nextint is for integer
        System.out.println("Your digit is " +num);
        //nextFloat
        //nextDouble
        /*
         * nextByte
         * nextBoolean
         * nextLong
         * nextShort
         */
    }
    
}
