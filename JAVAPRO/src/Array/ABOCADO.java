package Array;
import java.util.Scanner;
public class ABOCADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		int mk = 0;
		int abocado = 0;
		System.out.println("여보 마트가서 우유사고 만약에 아보카도 있으면 6개 사와 ");
		
		for(;;) {
			System.out.print("우유의 갯수를 입력하시오 : ");
				mk = scan.nextInt();
				
				if(mk == 6) {
					System.out.println("아보카도 있었어, 그래서 우유 6개 사왔어"); break;// 아보카도 6개를 사온다
				}else{
					System.out.println("우유 "+mk+"개 사왔어"); break;
				}
			
		}
	}

}
