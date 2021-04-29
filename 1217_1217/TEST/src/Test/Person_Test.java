package Test;
import java.util.Scanner;
public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int hol_add = 0;
		int jjak_add = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Á¤¼ö ÀÔ·Â : ");
			num = scan.nextInt();
			if(num % 2 == 0) jjak_add += num;
			else hol_add += num;
		}
		
		System.out.println("È¦¼öÀÇ ÃÑÇÕ : "+hol_add);
		System.out.println("Â¦¼öÀÇ ÃÑÇÕ : "+jjak_add);
	}

}
