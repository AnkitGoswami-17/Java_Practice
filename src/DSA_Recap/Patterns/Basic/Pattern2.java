package DSA_Recap.Patterns.Basic;

public class Pattern2 {
    public static void main(String[] args) {
       helper(5);
    }
    public static void helper(int n) {
        for (int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}
