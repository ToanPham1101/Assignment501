/*Fresher training 2022
*Author ToanPDT
*Date Mar 16, 2022
*Study assignment
*/
package exercise2;

import java.util.Scanner;

public class Wallet extends Person implements WalletManager {
	public Wallet(String name, int age, int ID) {
		super(name, age, ID);
	}
	
	Scanner sc = new Scanner(System.in);
	public int inputInt() {
		while(true) {
			try {
				int input = Integer.parseInt(sc.next());
				return input;
			}catch(NumberFormatException e) {
				System.err.println("Please input a number: ");
				System.out.println("Enter again: ");
			}
		}
	}
	public int[] inputBills() {
		System.out.println("Input number of bill: ");
		int size = inputInt();
		int[] bills = new int[size];
		for(int i = 0; i < bills.length; i++) {
			System.out.println("Input value of bill " + (i + 1) + ": ");
			bills[i] = sc.nextInt();
		}
		return bills;
	}
	public int inputWallet() {
		System.out.println("Input value of wallet: ");
		int wallet = inputInt();
		return wallet;
	}
	public int calcTotal(int[] bills) {
		int total = 0;
		for(int i = 0; i < bills.length; i++) {
			total += bills[i];
		}
		return total;
	}
	public void payMoney(int total, int wallet) {
		if(total > wallet) {
			System.out.println("You can't buy it.");;
		}
		else {
			System.out.println("You can buy it.");;
		}
	}
}
