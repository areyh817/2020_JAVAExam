package memojang;

import java.util.Scanner;
public class AccountingApp{
	public static void main(String args[]){

		int valueOfSupply = getvalueOfSupply();

		System.out.println("공급가액 : "+valueOfSupply);
		double VOT = getVat(valueOfSupply);
		//부가가치세 계산
		System.out.println("부가가치세 : "+VOT);
		// 합계
		System.out.println("총지급액 : "+getTotal(valueOfSupply, VOT));
	}
	static int getvalueOfSupply() {
		Scanner scan = new Scanner(System.in);
		System.out.print("공급가 입력 : ");
		int valueOfSupply = scan.nextInt();
		return valueOfSupply;
	}
	static double getVat(int vOS) {
		double vat = vOS*0.1; 
		return vat;
	}
	static int getTotal(int valueOfSupply, double vat) {
		int total = (int)(valueOfSupply + vat);	
		return total;
	}
     }




	