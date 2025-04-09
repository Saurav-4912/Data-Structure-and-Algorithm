package Serilization_Deserilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo {

  public static void main(String[] args) {

    ObjectOutputStream oos = null;
    FileOutputStream fos = null;

    try {

      fos = new FileOutputStream("student.txt");
      oos = new ObjectOutputStream(fos);

      Student student = new Student(101,"AAA",78);
      oos.writeObject(student);

      System.out.println("Object is serilized successfully");

    } catch (Exception e) {
      e.printStackTrace();
    } finally {

      try {
        oos.close();
        fos.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}