package TEST;
import java.util.Scanner;
public class Q1_1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int [] a = new int [3];
		
		for(;;) {
			System.out.print("데이타 입력 : ");
			int num = scan.nextInt();
			if(num >= 100 && num <= 999) {
				a[0] = num % 1000;
				a[1] = num % 100;
				a[2] = num % 10;
				System.out.println(num+" : "+a[0]/100+" "+a[1]/10+" "+a[2]);
			} else {
				System.out.println("프로그램 종료"); break;
			}
		}
	}

}
