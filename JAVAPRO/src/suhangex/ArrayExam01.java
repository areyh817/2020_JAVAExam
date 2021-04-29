package suhangex;
import java.util.Scanner;
public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.		
		int [] a = new int[] {10, 20, 30};
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		System.out.println("배열 a의 총합 : "+sum);
		
		// 정수 3개를 입력받아 배열 b에 넣은 후 배열 안에 모든 값을 더하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int [] b = new int[3];
		int plus = 0;
		
		System.out.print("정수 입력 : ");
		for(int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		
		for(int i = 0; i < b.length; i++) {
			plus += b[i];
		}
		
		System.out.println("배열 b의 총합 : "+plus);
		
		
		
		

	}

}
