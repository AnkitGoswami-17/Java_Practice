package Java_Basics;

public class SwitchExample {
    public static void main(String[] args) {
        String day = "MON";

        switch (day) {
            case "MON":
                System.out.println("It's Monday");
                break;
            case "TUE":
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }
}

