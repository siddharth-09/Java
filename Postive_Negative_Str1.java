import java.util.Scanner;

public class Postive_Negative_Str1 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        
        if(a>=0)
        {
            System.out.println(a +" is POSTIVE");
        }
        else
        {
            System.out.println(a + " is NEGATIVE");
        }
    }
    
}
