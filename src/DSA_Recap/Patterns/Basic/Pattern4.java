package DSA_Recap.Patterns.Basic;

public class Pattern4 {
    public static void main(String[] args) {
//        helper1(5);
        helper2(5);
    }
    public static void helper1(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
    public static void helper2(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
