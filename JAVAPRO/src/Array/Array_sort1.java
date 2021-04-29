package Array;
import java.util.Scanner;
public class Array_sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*10명의 점수를 입력 받아 오름차순으로 점수를 정렬하는 프로그램을 적성하라. (Array_sort1.java)
		- Scanner 를 통해 10명의 점수를 입력 받아 score 배열에 점수를 저장하라. 
		- 유효한 점수(0-100점)만 입력한다고 가정하자. 
		- 배열 방법은 선택정렬(selection sort)을 이용하라. 
		- 오름차순이란 낮은 점수에서 높은 점수 순서로 정렬하는 것을 의미한다. */
		
		Scanner scan = new Scanner (System.in);
		
		int [] score = new int[10];
		
		System.out.print("10명의 점수를 입력하시오 : ");
		for(int i = 0; i < score.length; i++) { // score 배열방 안에 10명의 점수 넣기
			score[i] = scan.nextInt();
		}
		
		for(int i = 0; i < score.length-1; i++) { // 오름차순 정렬하기
			for(int j = i+1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				} 
			}
		}
		
		for(int i = 0; i < score.length; i++) { // 출력
			System.out.print(score[i]+"점 \t");
		}
	}

}
