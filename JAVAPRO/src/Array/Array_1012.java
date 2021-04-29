package Array;
import java.util.Scanner;
public class Array_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double [] a = new double[5];
		double score = 0;
		
		System.out.print("5명(개)의 점수를 입력하시오 : ");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextDouble();
		}
		
		for(int i = 0; i < a.length; i++) {
			score += a[i];
			
		}
		 
		System.out.println("총합 : "+(int)score);
		 System.out.println("평균 : "+(int)score/a.length);
		 
		
	}

}
