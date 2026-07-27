public class Student{
  public static void main(String[] args) {
    St s = new St(); 
    s.rollno = 3; s.name = "Akshat"; s.cgpa = 7.8;
    System.out.println(s.rollno);
    System.out.println(s.name);
    System.out.println(s.cgpa);
  }
}

public class St{
  int rollno ; 
  String name; 
  double cgpa; 
}
