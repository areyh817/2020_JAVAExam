package TEST;
import java.util.Scanner;

class line{
	int x, y;
	int x1, y1;
	double gongsik;
	static int L_cnt;
	
	double dogsan() {
		gongsik = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		return gongsik;
	}
	
	line(){
		L_cnt++;
	}

}

public class lineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(line.L_cnt);
		Scanner scan = new Scanner(System.in); 
		
		line kim = new line(); // kim 객체
		System.out.print("네 개의 점 입력 : "); // kim 객체 입력
		kim.x = scan.nextInt();
		kim.y = scan.nextInt();
		kim.x1 = scan.nextInt();
		kim.y1 = scan.nextInt();	
		System.out.println(line.L_cnt+". 두 점 ("+kim.x+","+kim.y+") ("+kim.x1+","+kim.y1+")의 거리는 "+kim.dogsan()); // kim 객체 출력
		
		line lee = new line();	// lee 객체
		System.out.print("네 개의 점 입력 : "); // lee 객체 입력 
		lee.x = scan.nextInt();
		lee.y = scan.nextInt();
		lee.x1 = scan.nextInt();
		lee.y1 = scan.nextInt();
		System.out.println(line.L_cnt+". 두 점 ("+lee.x+","+lee.y+") ("+lee.x1+","+lee.y1+")의 거리는 "+lee.dogsan()); // lee 객체 출력
			

	}

}
