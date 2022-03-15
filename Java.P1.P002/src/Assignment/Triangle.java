/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/
package Assignment;

import java.util.Scanner;

public class Triangle extends Calculator {
	double sideA;
	double sideB;
	double sideC;
	public Triangle() {
		
	}
	public Triangle(double a, double b, double c) {
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}
	
	public void input(Scanner sc) {
		System.out.println("Please input side A of Triangle: ");
		this.sideA = sc.nextDouble();
		System.out.println("Please input side B of Triangle: ");
		this.sideB = sc.nextDouble();
		System.out.println("Please input side C of Triangle: ");
		this.sideC = sc.nextDouble();

	}
	public double getArea() {
		double p = this.getPerimeter();
		return (Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)))/2;
	}
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	public void printResult() {
		System.out.println("-----Triangle-----");
		System.out.println("Side A : " + sideA);
		System.out.println("Side B : " + sideB);
		System.out.println("Side C : " + sideC);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}
