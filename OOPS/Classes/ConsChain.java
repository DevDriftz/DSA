public class ConsChain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Akshat");
        Student s3 = new Student("Akshat", 101, 8.4);

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
    }
}

class Student {

    private String name;
    private int rollno;
    private double cgpa;

    // Default constructor
    Student() {
        this("Null", 0, 0.0);
    }

    // Constructor with only name
    Student(String name) {
        this(name, 0, 0.0);
    }

    // Parameterized constructor
    Student(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("CGPA    : " + cgpa);
    }
}
