/*Fresher training 2022
*Author ToanPDT
*Date Mar 16, 2022
*Study assignment
*/
package exercise2;

public interface WalletManager {
	public int inputInt();
	public int[] inputBills();
	public int inputWallet();
	public int calcTotal(int[] bills);
	public void payMoney(int total, int wallet);
}
