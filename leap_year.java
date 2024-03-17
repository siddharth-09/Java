import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Enter a year ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y %4 == 0)
        {
            if (y%100 == 0) 
            {
                if (y % 400 == 0) 
                {
                    System.out.println("Leap year");   
                }

                    else{
                            System.out.println("Str1t a leap year");
                        }
            }

            else{
                System.out.println(" a leap year");
            }
        }
        else
        {
            System.out.println("Str1t a leap year");
        }
}
}

