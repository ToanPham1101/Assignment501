/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/
package Assignment;

import java.util.Scanner;

public class Circle extends Calculator {
	double radius;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void input(Scanner sc) {
		System.out.println("Please input radius of Circle: ");
		this.radius = sc.nextDouble();
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	public void printResult() {
		System.out.println("-----Circle-----");
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}
