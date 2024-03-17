import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your First digit ");
        Scanner sc= new Scanner(System.in);
            float a = sc.nextFloat();
        System.out.println("Enter your second digit ");
            float b = sc.nextFloat();
        System.out.println("What do you want (+ , - , * , / , %) ");
        char ch = sc.next().charAt(0);

        switch (ch) 
        {
            case '+':
                    float add = a+b;
                    System.out.println(add);    
                break;

            case '-':
                    float min = a-b;
                    System.out.println(min);    
                break;

            case '*':
                    float multiply = a*b;
                    System.out.println(multiply);    
                break;

            case '/':
                    float Div = a/b;
                    System.out.println(Div);    
                break;

            case '%':
                    float mod = a%b;
                    System.out.println(mod);    
                break;

        
            default:
            System.out.println("Please enter a valid input");
                break;
        }
    }
}

