package Array;
import java.util.Scanner;
public class Array_mmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int [] a = new int[5];
		int [] b = new int[5];
		int [] c = new int[10];
		
		System.out.print("제 1 데이타 5개 입력 : ");
		for(int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();		
		}
		
		System.out.print("제 2 데이타 5개 입력 : ");
		for(int i = 0; i < 5; i++) {
			b[i] = scan.nextInt();
		}
		System.out.print("제 1 데이타 정렬 : "); // 1 데이터 정렬
	      for(int i = 0; i < a.length; i++) {
	          for(int j = 0; j < a.length-i-1; j++) {
	             if(a[j] > a[j+1]) {
	                int temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	             }
	          }
	       }
	      for(int i = 0; i < a.length; i++) { // 1 데이터 정렬 출력
	    	  System.out.print(a[i]+" ");
	      }
	      System.out.print("\n제 2 데이타 정렬 : "); // 2 데이터 정렬
	      for(int i = 0; i < b.length; i++) {
	          for(int j = 0; j < b.length-i-1; j++) {
	             if(b[j] > b[j+1]) {
	                int temp = b[j];
	                b[j] = b[j+1];
	                b[j+1] = temp;
	             }
	          }
	       }
	      for(int i = 0; i < b.length; i++) { // 2 데이터 정렬 출력
	    	  System.out.print(b[i]+" ");
	      }

	     /* for(int i = 0; i < c.length; i++) { // c배열 방안에 a,b넣기
	    	  if(i < a.length) c[i] = a[i];
	    	  else c[i] = b[i-a.length];
	    	  
	      }*/
	  
	      for(int i = 0; i < c.length; i++) { // a, b 데이터 정렬
	    	  for(int j = 0; j < c.length-i-1; j++) {
	    		  if(c[j] > c[j+1]) {
	    			  int temp = c[j];
	    			  c[j] = c[j+1];
	    			  c[j+1] = temp;
	    		  }
	    	  }
	      }
	      
	      for(int i = 0; i < c.length; i++) {
	    	  for(int j = 0; j < c.length-i-1; j++) {
	    		  if(a[j] == b[j]) {
	    			  int temp = c[j];
	    			  c[j] = c[j+1];
	    			  c[j+1] = temp;
	    		  }
	    	  }
	      }
	      System.out.print("\n데이터 정렬 : ");
	      for(int i = 0; i < c.length; i++) { // c 데이터 정렬 출력
	    	  System.out.print(c[i]+" ");
	      }
	      
	}
	
}
