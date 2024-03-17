public class Continue_statement {
    public static void main(String[] args) {
        // only print odd or even number using loop
        /* even mate elimate odd numbers and vice versa 
         * i % 2 == 0 toh odd numbers print and for even i % 2 != 0 
         */
        for(int i = 1; i <=10 ; i++){
            if (i % 2!=0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
