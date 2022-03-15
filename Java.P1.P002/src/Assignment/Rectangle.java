/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/
package Assignment;

import java.util.Scanner;

public class Rectangle extends Calculator {
	double width;
	double length;
	public Rectangle() {
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public void input(Scanner sc) {
		System.out.println("Please input width of Rectangle:" );
		this.width = sc.nextDouble();
		System.out.println("Please input length of Rectangle:" );
		this.length = sc.nextDouble();
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return (width + length) * 2;
	}
	public void printResult() {
		System.out.println("-----Rectangle-----");
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
	
}
