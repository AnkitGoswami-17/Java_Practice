package Java_Basics;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int a = 56;
        System.out.println(a);
        a=20;
        System.out.println(a);
        String name = "John";
        System.out.println(name);


        int i =50;
        double d = i;//implicit type casting
        System.out.println(i);
        System.out.println(d);

        double myval = 34.22;
        int myint = (int)myval;//explicit type casting
        System.out.println(myval + " and " + myint);

        int m = 81;

        if (m > 90) {
            System.out.println("Grade-A");
        } else  if ( m > 80 && m <=90) {
            System.out.println("Grade-B");
        } else {
            System.out.println("fail");
        }

        int n = 141;

        if ( n > 0) {
            if (n % 2 == 0) {
                System.out.println("It's a even number");
            } else {
                System.out.println("It's a odd number");
            }
        }
    }
}
