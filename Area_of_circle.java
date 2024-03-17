import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Double pie=3.1415;
        System.out.println("Enter Radius");
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        Double area = (pie*r*r);
        System.out.println(area);
    }
}
