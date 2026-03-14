package oops;

class A {

}

class B extends A {

}

public class Parent {

    public A m1() {
        System.out.println("I am m1() of parent");
        return new A();
    }
}

//public > protected > default > private

//co-varient return type is allowed in method overridding
class Child extends Parent {
    @Override
    public B m1() {
        System.out.println("I am m1() of child");
        return new B();
    }
}
