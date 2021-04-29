package Array;
import java.util.Scanner;
public class Array_10121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int [] a = new int[20];
		int [] cnt = new int[10];
		
		
		System.out.print("0 ~ 9 사이의 수 입력 : "); // 수 입력하기
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <cnt.length; j++) {
				switch (a[i]) {
					case 0 : cnt[0]++; 
					case 1 : cnt[1]++; 
					case 2 : cnt[2]++; 
					case 3 : cnt[3]++; 
					case 4 : cnt[4]++;
					case 5 : cnt[5]++; 
					case 6 : cnt[6]++; 
					case 7 : cnt[7]++; 
					case 8 : cnt[8]++; 
					case 9 : cnt[9]++; 
				}
			
			}

		}
		
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(i+"의 개수 : "+cnt[i]);
		}
	}
}


