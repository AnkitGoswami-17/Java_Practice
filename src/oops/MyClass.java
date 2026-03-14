package oops;

abstract public class MyClass {

    public void cal() {
        System.out.println("It's Calculating");
    }

    abstract public void launchRocket();
}

class  Start {
    public static void main(String[] args) {
        //MyChild ch1 = new MyChild();
        MyClass ch1 = new MyChild();
        ch1.launchRocket();
        ch1.cal();
    }
}
