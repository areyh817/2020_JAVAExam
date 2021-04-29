package Class_Object;
import java.util.Scanner;

class line{
	int x, y;
	int x1, y1;
	double gongsik;
	
	double dogsan() {
		gongsik = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		return gongsik;
	}
	
}
public class linetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		line kim = new line();
		//double target = Math.sqrt(kim.Dsitance3());
		
		System.out.print("네 개의 점 입력 : ");
		kim.x = scan.nextInt();
		kim.y = scan.nextInt();
		kim.x1 = scan.nextInt();
		kim.y1 = scan.nextInt();
		
		System.out.println("두 점 ("+kim.x+","+kim.y+") ("+kim.x1+","+kim.y1+")의 거리는 "+kim.dogsan());
			

	}

}
