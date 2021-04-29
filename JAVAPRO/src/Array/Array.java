package Array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double [] a = new double[100];
		double score = 0;
		int cnt = 0; // cnt 개 수세기
		int k = 0;  //
		int i = 0;
		
		System.out.print("입력하시오 : ");
		for(i = 0; i < a.length; i++) {
			a[i] = scan.nextDouble();
			
			if(a[i] == 0) break;
			//cnt++;
		}
		
		k = i-1;
		
		for(int j = 0; j < a.length; j++) {
			score += a[j];
			
		}
		 
		System.out.println("총합 : "+(int)score);
		System.out.println("평균 : "+(int)score/k);
		 
		
	}

}
