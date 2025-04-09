package Numerical_Problem;

import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius : ");
    float radius = sc.nextFloat();

    double areaOfCircle = Math.PI * radius * radius;

    System.out.println("Area Of Circle : " + areaOfCircle);

    sc.close();
  }
}
