package oops01;

 abstract class Veichle { //abstract class
    private String brand; //encapsulation
    private int year;

    public Veichle (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() { //controlled access
        return brand;
    }

    public int getYear() {
        return year;
    }

    public abstract double calculateTax();//abstract method
}

class Car extends Veichle { //Inheritance
    private final double price;

    public Car (String brand, int year, double price) {
        super(brand, year);
        this.price = price;
    }

    @Override
    public double calculateTax() { //polymorphism
        return price * 0.10;
    }
}

class Truck extends Veichle { //Inheritance
    private final double price;

    public Truck (String brand, int year, double price) {
        super(brand, year);
        this.price = price;
    }

    @Override
    public double calculateTax() { //polymorphism
        return price * 0.20;
    }
}

public class DealerShip {
    public static void main(String[] args) {
        Veichle fleet[] = {
                new Car("Toyota",2025,1345678.67),
                new Truck("Tata",2025,2045782.97)
                };  //We can create instance of child class with parent class
                    //for example if A is parent class and B is Child and want to use any method
                    //of A or B we can declare it like A obj = new B(); them call obj.method of B()

        for (Veichle v: fleet) {
            System.out.println(v.getBrand()+" "+v.getYear()+" "+v.calculateTax());
        }

    }
}
