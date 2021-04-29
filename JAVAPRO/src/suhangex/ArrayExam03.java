// random함수를 이용하여 2차원배열에 넣고 2차원 배열의 총합과 평균을 구하는 프로그램을 작성하시오.
package suhangex;
public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int[10][10]; // 배열 선언
		int total = 0; // total = 총합
		int average = 0; // average = 평균
		
		for(int i = 0; i < a.length; i++) { // 2차원 배열에 random함수를 이용하여 정수 넣기
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = ((int)(Math.random()*36+10));
			}
		}
		
		for(int i = 0; i < a.length; i++) { // 총합계산하여 total에 넣기
			for(int j = 0; j < a[i].length; j++) {
				total += a[i][j];
				
			}
		}
		
		average = total / (a.length * a[0].length); // 평균계산
		System.out.println("total = "+total); // 총합 출력
		System.out.println("average = "+average); // 평균 출력

		

	}

}
