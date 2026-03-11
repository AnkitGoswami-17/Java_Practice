package oops;

public class Student {

    //data:data members: instance variable

    int studentId;
    String studentName;
    String studentCity;

    public Student() {
        System.out.println("Creating Object");
    }

    public Student(int s1){
        System.out.println("This is a parameterized consturctor");
    }

    public Student(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentCity = studentCity;
        this.studentName = studentName;
    }
//Behaviour : member methods : methods : (function)

    public void study() {
        System.out.println(this.studentName + " is Studying");
    }

    public void study(float f) {
        System.out.println("Method Overloading-1");
    }

    public double study(float f,int n) {
        System.out.println("Method overloading-2");
        return f;
    }

    public void showFullDetails() {
        System.out.println("My Name is " + studentName);
        System.out.println("My Id is " + studentId);
        System.out.println("My City is " + studentCity);
    }
}


