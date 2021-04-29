package Array;
import java.util.Scanner;
public class Array_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("ют╥б  : ");
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]+10);
		}

	}

}
