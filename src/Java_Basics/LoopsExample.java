package Java_Basics;

public class LoopsExample {
    public static void main(String[] args) {
        //1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >=1; i--) {
            System.out.println(i);
        }

        int j = 100;
        while (j < 110) {
            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
            j++;
        } while (j <= 120);
    }
}
