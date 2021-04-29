package Array;
import java.util.Scanner;
public class ArrayScore{
	public static void main(String args[]){

		Scanner scan = new Scanner (System.in);

			int [] a = new int[];
			int [] cnt = new int[100];
			
			for(int i = 0; i < a.length; i++){
				do{
					System.out.print("¼ö ÀÔ·Â : ");
					int a = scan.nextInt();
					cnt[i] = a[i];
					cnt++;
					if( a[i] < 0 && a[i] > 100 ) break;

				}while(true);
			}
				
			/*for(int i = 0; i < cnt.length; i++){
				switch(a[i]){
					case 10: System.out.println("100 : "+cnt[i]);
					case 9: System.out.println("90 ~ 99 : "+cnt[i]);
					case 8: System.out.println("80 ~ 89 : "+cnt[i]);
					case 7: System.out.println("70 ~ 79 : "+cnt[i]);
					case 6: System.out.println("60 ~ 69 : "+cnt[i]);
					case 5: System.out.println("50 ~ 59 : "+cnt[i]);
					case 4: System.out.println("40 ~ 49 : "+cnt[i]);
					case 3: System.out.println("30 ~ 39 : "+cnt[i]);
					case 2: System.out.println("20 ~ 29 : "+cnt[i]);
					case 1: System.out.println("10 ~ 19 : "+cnt[i]);
					defult: System.out.println("0 ~ 9 : "+cnt[i]);
				}
			}*/
	}
}