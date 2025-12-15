package DSA_Recap.Patterns.Basic;

public class Pattern3 {
    public static void main(String[] args) {
//        helper1(5);
        helper2(5);
    }
    public static void helper1(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void helper2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
