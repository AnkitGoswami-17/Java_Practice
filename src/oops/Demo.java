package oops;

public class Demo {

    public static void main(String[] args) {

        //now creating object of student
        Student st1;
        st1 = new Student(2);

        st1.studentName = "Ram";
        st1.studentCity = "Kolkata";
        st1.studentId = 1234;

        st1.study();
        st1.showFullDetails();

        Student st2 = new Student(1243,"Shyam","Hyderabad");

//        st2.studentName = "Shyam";
//        st2.studentCity = "Hyderabad";
//        st2.studentId = 1243;

        st2.showFullDetails();
        st2.study();

        Student st3 = new Student(1243,"Ramu","Hyderabad");
        st3.study();

        Animal d1 = new Dog();

        d1.eating();
        System.out.println(d1.color);
        d1.speak();

    }
}

