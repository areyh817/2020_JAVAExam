package TEST;
import java.util.Scanner;
public class test_1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int hol = 0;
		int jjak = 0;
		
		System.out.print("수 입력 : ");
		
		for(int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			if(num % 2 == 0) {
				jjak = jjak + num;
			}else {
				hol += num;
			}
		}
		
		System.out.println("입력받은 홀수의 총 합 : "+hol);
		System.out.println("입력받은 짝수의 총 합 : "+jjak);
	}

}
