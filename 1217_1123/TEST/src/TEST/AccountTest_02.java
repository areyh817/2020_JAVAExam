package TEST;
import java.util.Scanner;

class Account{
	
	static double leeja = 0.02;
	
	int fixedDeposit(int money, int year) {
		return (int)((money*leeja)*year)+money;
		
	}
	

	
}
	
public class AccountTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Account kim = new Account();
		
		
		System.out.print("기간 : ");
		int year = scan.nextInt();
		//kim.fixedDeposit(year);
		System.out.print("금액 : ");
		int money = scan.nextInt();
		System.out.println("이자 : "+(kim.fixedDeposit(money, year)-money));
		System.out.println("총지급금액 : "+kim.fixedDeposit(money, year));
		
		

	}

}
