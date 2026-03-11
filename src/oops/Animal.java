package oops;

public class Animal {
    String color = "Blue";
    int x =5;

    public Animal(int x) {
        this.x = x;
        System.out.println("calling parent class constructor " + x);
    }

    public void eating() {
        System.out.println("Animal is eating");
    }
}
