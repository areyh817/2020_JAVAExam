package TEST;
class Dimension{
	int r; // 반지름
	int a; // 가로
	int b; // 세로
	
	double Cir(){
		return r*r*Math.PI;
		
	}
	
	double Tri() {
		return a*b*0.5;
	}
}
public class Q1217_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dimension Circle1 = new Dimension();
		Dimension Circle2 = new Dimension();
		Dimension Triangle1 = new Dimension();
		Dimension Triangle2 = new Dimension();
		Dimension Triangle3 = new Dimension();
		
		Circle1.r = (int)(Math.random()*6+5); // 원 첫 번째
		System.out.println("1번째 도형이 생성되었습니다.");
		System.out.println("반지름 "+Circle1.r+"인 원의 넓이는 "+Circle1.Cir());
		System.out.println("\n");
		
		Circle2.r = (int)(Math.random()*6+5); // 원 두 번째
		System.out.println("2번째 도형이 생성되었습니다.");
		System.out.println("반지름 "+Circle2.r+"인 원의 넓이는 "+Circle2.Cir());
		System.out.println("\n");
		
		Triangle1.a = (int)(Math.random()*6+5); // 삼각형 첫 번째
		Triangle1.b = (int)(Math.random()*6+5);
		System.out.println("3번째 도형이 생성되었습니다.");
		System.out.println("가로 "+Triangle1.a+"이고, "+Triangle1.b+"인 삼각형의 넓이는 "+Triangle1.Tri());
		System.out.println("\n");
		
		Triangle2.a = (int)(Math.random()*6+5); // 삼각형 두 번째번
		Triangle2.b = (int)(Math.random()*6+5);
		System.out.println("4번째 도형이 생성되었습니다.");
		System.out.println("가로 "+Triangle2.a+"이고, "+Triangle2.b+"인 삼각형의 넓이는 "+Triangle2.Tri());
		System.out.println("\n");
		
		Triangle3.a = (int)(Math.random()*6+5); // 삼각형 세 번째
		Triangle3.b = (int)(Math.random()*6+5);
		System.out.println("5번째 도형이 생성되었습니다.");
		System.out.println("가로 "+Triangle3.a+"이고, "+Triangle3.b+"인 삼각형의 넓이는 "+Triangle3.Tri());
		System.out.println("\n");

		
		
		
	}

}
