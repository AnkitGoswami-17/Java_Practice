package Java_Basics;

public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            if (i==50) {
                continue;
            }

            if (i == 50) {
                System.out.println("end");
                break;
            }
        }
    }
}

//break - It just break the loop on the specified condition
//continue - It will continue the iteration
