import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        System.out.println("Enter Your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Your can vote , drive, drink etc");
        }

        else if(age>=13 && age<=18){
            System.out.println("Your a teenager");
        }
        else{
            System.out.println("Your Str1t adult");
        }
    }
}
