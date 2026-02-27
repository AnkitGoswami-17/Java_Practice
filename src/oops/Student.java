package oops;

public class Student {

    //data:data members: instance variable

    int studentId;
    String studentName;
    String studentCity;

//Behaviour : member methods : methods : (function)

    public void study() {
        System.out.println(studentName + " is Studying");
    }

    public void showFullDetails() {
        System.out.println("My Name is " + studentName);
        System.out.println("My Name is " + studentId);
        System.out.println("My Name is " + studentCity);
    }
}


