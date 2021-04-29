package Array;
import java.util.Scanner;

public class Array_mm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[5];
		int [] b = new int[10];
		int [] c = new int[15];
		
		System.out.print("5개의 data 입력  : ");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();	
			//c[i] = a[i];
		}
		System.out.print("10개의 data 입력 : ");
		for(int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
			//c[i+5] = b[i];
	
		}
	
		for(int i = 0; i < c.length; i++) {
			if(i < a.length) c[i] = a[i];
			else c[i]=b[i-a.length];

		}
		for(int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]+"\n");
		}
		for(int i = 0; i < b.length; i++) {
			System.out.print("\t"+b[i]+"\n");
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print("\t"+c[i]+"\n");
			
		}

	}

}
