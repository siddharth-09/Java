public class call_value {

    public static void ChangeA(int a ){
        System.out.println("aa Change a ni value che = " + a );
        a = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        ChangeA(a);
        System.out.println(a);
        
    }
}
