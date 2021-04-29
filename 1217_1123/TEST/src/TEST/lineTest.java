package TEST;
import java.util.Scanner;

class line{
	/*int x, y;
	int x1, y1;*/
	double gongsik;
	static int L_cnt;
	point p1 = new point();
	point p2 = new point();
	
	double dogsan() {
		gongsik = Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
		return gongsik;
	}
	
	line(){
		System.out.println("객체 생성 : "+ ++L_cnt);
	}

}

class point{
	int x, y;

}



public class lineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		line [] a = new line[5];
		for(int i = 0; i < 5; i++) {
			a[i] = new line();
			a[i].p1.x = (int)(Math.random()*11+5);
			a[i].p1.y = (int)(Math.random()*11+5);
			a[i].p2.x = (int)(Math.random()*11+5);
			a[i].p2.y = (int)(Math.random()*11+5);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(line.L_cnt+". 두 점 ("+a[i].p1.x+","+a[i].p2.y+") ("+a[i].p1.x+","+a[i].p2.y+")의 거리는 "+a[i].dogsan());
		}
		
	/*	System.out.println(line.L_cnt);
		 
		
		line kim = new line(); // kim 객체
		System.out.print("네 개의 점 입력 : "); // kim 객체 입력
		kim.p1.x = scan.nextInt();
		kim.p1.y = scan.nextInt();
		kim.p1.x = scan.nextInt();
		kim.p2.y = scan.nextInt();	
		System.out.println(line.L_cnt+". 두 점 ("+kim.p1.x+","+kim.p2.y+") ("+kim.p1.x+","+kim.p2.y+")의 거리는 "+kim.dogsan()); // kim 객체 출력
		
		line lee = new line();	// lee 객체
		System.out.print("네 개의 점 입력 : "); // lee 객체 입력 
		lee.x = scan.nextInt();
		lee.y = scan.nextInt();
		lee.x1 = scan.nextInt();
		lee.y1 = scan.nextInt();
		System.out.println(line.L_cnt+". 두 점 ("+lee.p1.x+","+lee.p2.y+") ("+lee.p1.x+","+lee.p2.y+")의 거리는 "+lee.dogsan()); // lee 객체 출력
			
*/
	}

}
