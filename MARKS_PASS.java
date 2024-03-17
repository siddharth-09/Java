import java.util.Scanner;

public class MARKS_PASS {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        String Status = (m>=33)?"PASS":"FAIL";
        System.out.println(Status);
    }
}
