package suhangex;
import java.util.Scanner;
public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int [][] a = new int [][] {{10, 20, 30}, {30, 20, 10}};
		int total = 0;
		double average = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				total += a[i][j];
				
			}
		}
		
		average = (double)total / (a.length * a[0].length);
		System.out.println("total = "+total);
		System.out.println("average = "+average);

	}

}
