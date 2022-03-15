/*Fresher training 2022
*Author ToanPDT
*Date Mar 15, 2022
*Study assignment
*/
package Assignment;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Rectangle chunhat = new Rectangle();
		Circle tron = new Circle();
		Triangle tamgiac = new Triangle();
		
		System.out.println("=====Calculator Shape Progarmer=====");
		chunhat.input(in);
		tron.input(in);
		tamgiac.input(in);
		
		chunhat.printResult();
		tron.printResult();
		tamgiac.printResult();
		
	}
}	
