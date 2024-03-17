public class reverse_given_no {
    public static void main(String[] args) {

        int rev = 0;
        
        for( int n = 10899; n>0; n=n/10){

            int ld = n %10;
            rev = (rev *10) + ld;
        }
        System.err.print(rev);
    }
}
