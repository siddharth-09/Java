public class Swapping_function {

    public static void swap(int a , int b){
        int temp;
    
        temp = a;
        a = b;
        b = temp;
        System.out.println("No after Swapping : "+a +", "+b);
    }
   public static void main(String args[])
   {
    int a = 10;
    int b = 5;
    swap(a , b);
   }
}
