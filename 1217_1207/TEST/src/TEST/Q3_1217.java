package TEST;
class Dimension1{
	int r;
	int a;
	int b;
	static int cnt;
	
	Dimension1(){
		cnt++;
	}
	
	double Cir() {
		return r*r*Math.PI;
	}
	double Tri() {
		return a*b*0.5;
	}
}
public class Q3_1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimension1 [] area = new Dimension1[5];
		
		for(int i = 0; i < area.length; i++) {
			area[i] = new Dimension1();
			
			if(i < 2) {
				System.out.println(Dimension1.cnt+"번째 도형이 생성되었습니다.");
				area[i].r = (int)(Math.random()*6+5);
				System.out.println("반지름 "+area[i].r+"인 원의 넓이는 "+area[i].Cir());
				System.out.println("\n");
			} else {
				System.out.println(Dimension1.cnt+"번째 도형이 생성되었습니다.");
				area[i].a = (int)(Math.random()*6+5);
				area[i].b = (int)(Math.random()*6+5);
				System.out.println("가로 "+area[i].a+"이고, 높이가"+area[i].b+"인 삼각형의 넓이는 "+area[i].Tri());
				System.out.println("\n");
				
			}
		}

	}

}
