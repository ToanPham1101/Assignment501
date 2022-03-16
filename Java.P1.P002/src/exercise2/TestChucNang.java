/*Fresher training 2022
*Author ToanPDT
*Date Mar 16, 2022
*Study assignment
*/
package exercise2;

public class TestChucNang {
	public static void main(String[] args) {
		Wallet a = new Wallet("Toan", 25, 1);
		int[] bills = a.inputBills();
		int wallet = a.inputWallet();
		int total = a.calcTotal(bills);
		System.out.println("this is total of bill: " + total);
		a.payMoney(total, wallet);
		
		
	}
}
