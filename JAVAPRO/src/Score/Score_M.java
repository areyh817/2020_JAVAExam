package Score;
import java.util.Scanner;
class Student {
	String num; // 학번
	String name; // 이름
	int [] score = new int[5];
	double average; // 평균
	char grade; // 등급
	
}

public class Score_M{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		// Student kim = new Student();
		// int cnt = 1;
		System.out.print("학생 수 입력 : ");
		int cnt = scan.nextInt();
		Student [] stu = new Student[cnt];
	
		
	
		

		for(int i = 0; i < cnt; i++){
			//입력 Score_in();
			stu[i] = new Student();
			System.out.print("학번 : ");
			stu[i].num = scan.next();
			System.out.print("이름 : ");
			stu[i].name = scan.next();

			String [] subj = new String[]{"국어", "영어", "JAVA", "Cpro"};
			//int [] score = new int[5]; //과목 4개

			for(int j = 0; j<stu[i].score.length-1; j++){
				do{
					System.out.print(subj[j]+": ");
					stu[i].score[j] = scan.nextInt();
					if(stu[i].score[j]>=0 && stu[i].score[j]<=100) break;
				}while(true);
				stu[i].score[stu[i].score.length-1] += stu[i].score[j]; // 총점 계산
			}


			stu[i].average = calc_avg(stu[i].score[stu[i].score.length-1], stu[i].score.length-1); //평균 계산 메서드 호출
			stu[i].grade = calc_grade(stu[i].average); // 등급 계산 메서드 호출

		}
		
		for(int i = 0; i < cnt; i++) {
			//출력
			System.out.print(stu[i].num + "\t" +stu[i].name + "\t");
			for(int j = 0; j < stu[i].score.length; j++)
				System.out.print(stu[i].score[j] + "\t");
			System.out.println(stu[i].average + "\t" + stu[i].grade);
		}
	}
	static double calc_avg(int s, int cnt){
		double n = (double)s/cnt;
		return n;

	}

	static char calc_grade(double n){
		char grade;
		switch((int)(n/10)){
			case 10:
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'E';

		}

		return grade;
	}
}

