import java.util.*;

public class Pattern_calulator_part1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String one , two;//use for refrence
        one = "Simple";
        two = "Inverted";

        System.out.println("Enter What Pattern Do you want(Simple or Inverted)");
// simple or inverted save in sc
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();


        System.out.println("Enter which pattern do you want (no or char)");
        String Str2 = sc.nextLine();

        System.out.println("Enter how many lines do you want:");
        int n = sc.nextInt();
        System.out.println("\nYour Pattern is ready:");
        if (one.equals(Str1)) {
            if (Str2.equals("no")) {

                    for(int line = 1; line<=n;line++){
                    for(int nu=1;nu<=line;nu++){
                                    System.out.print(nu);
                    }
                        System.out.println();
                    }
                
            }
            else if(Str2.equals("char")){

                for(int line = 1; line<=n;line++){
                    for(int s=1;s<=line;s++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            else{
                System.out.println("Please enter a valid input");
            }
        }

        else if(two.equalsIgnoreCase(Str1))
        {
            if (Str2.equals("char")) {
                    for(int line = 1; line<=n;line++){
                        for(int s = n; s>=line ; s--)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
            }
            else if (Str2.equals("no")) {

        for(int line = n; line >= 1; line--) {
            // Print spaces
            for(int space = 1; space <= n - line; space++) {
                System.out.print("");
            }
            // Print numbers
            for(int nu = 1; nu <= line; nu++) {
                System.out.print(nu);
            }
            System.out.println();
            }
        }
            else{
                System.out.println("Please enter a valid");
            }

}

            else{
                System.out.println("Please enter a valid input");
            }
    }
}
