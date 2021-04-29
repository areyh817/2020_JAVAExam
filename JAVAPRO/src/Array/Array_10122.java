package Array;
import java.util.Scanner;
public class Array_10122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int [] cnt = new int[10];
		
		System.out.println("0 ~ 9 사이의 수 입력 : ");
		for(int i = 0; i < 20; i++) {
			int a = scan.nextInt();
			cnt[a]++;
			
		}
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(i+"의 개수 : "+cnt[i]+"개");
		}
	}

}
