import java.lang.reflect.*;

class Student {
  private int rno = 101;

  private String name = "Saurav";

  private double per = 89.00;

  // Parametrized Constructor
  public Student(int rno, String name, double per) {
    this.rno = rno;
    this.name = name;
    this.per = per;
  }

  public Student(int rno, String name) {
    this.rno = rno;
    this.name = name;

  }

  public Student(int rno) {
    this.rno = rno;

  }

  // Default Constructor
  public Student() {
  }

  // Setter and Getter Method
  public int getRno() {
    return rno;
  }

  public void setRno(int rno) {
    this.rno = rno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPer() {
    return per;
  }

  public void setPer(double per) {
    this.per = per;
  }

  @Override
  public String toString() {
    return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
  }

}

public class Demo {
  public static void main(String[] args) {

    Class<Student> C = Student.class;

    System.out.println("Name of Class : " + C.getName());

    System.out.println("------------------------------------------");

    System.out.println("Super Class : " + C.getSuperclass());

    Field f[] = C.getDeclaredFields();

    System.out.println("---------------------------------------------------");

    // Number of data member in the class.
    System.out.println("List Of Data Member : " + f.length);

    System.out.println("Fields : ");
    for (Field data : f) {
      System.out.println(data);
    }
    System.out.println("---------------------------------------------------");

    Constructor c[] = C.getDeclaredConstructors();

    System.out.println("List Of Constructor : " + c.length);

    System.out.println("Constructor : ");
    for (Constructor data : c) {
      System.out.println(data);
    }
    System.out.println("---------------------------------------------------");

    Method m[] = C.getDeclaredMethods();

    System.out.println("List Of Methods : " + m.length);

    System.out.println("Methods : ");
    for (Method data : m) {
      System.out.println(data);
    }
    System.out.println("---------------------------------------------------");

  }
}