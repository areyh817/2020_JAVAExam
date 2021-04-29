/*0~100까지의 점수를 입력받아 10점 단위로 인원수를 출력하는 프로그램을 작성하시오.(Array_Score.java)
1. 0~100까지의 점수를 입력받아 해당되는 인원수 증가
2. 그 이외의 점수가 입력되면 각 점수대별 인원 수 출력 
      0~9점 :    명
      10~19점 :    명
      20~29점 :    명


      90~100점 :    명*/
      
package TEST;

import java.util.Scanner;
public class Array_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int [] a = new int[10];
		int score = 0;
		
		for(;;) {

				System.out.print("점수 입력 : ");
				score = scan.nextInt();
				//a[score/10]++;
				
				if(score < 0 || score > 100) break;
				else if(score == 100) a[9]++;
				else a[score/10]++;
				
		}
				for(int i = 0; i < a.length; i++) {
					System.out.println((i*10)+" ~ "+(i*10+9)+" : "+a[i]);
					
				}
				System.out.println("90 ~ 100 : "+a[9]);

		}
	}

