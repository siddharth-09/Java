public class Str1erted_Star_pattern {
    public static void main(String[] args)
    {  
        int n = 5;
        for(int line = 1; line<=n;line++){
            for(int s = n; s>=line ; s--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
