package CLASS;

class Calc{
	double area;
	
	Calc(int r){ // 매개변수 1개
		area = r*r*Math.PI;
	}
	Calc(int a, int b){
		area = a*b;
	}
	Calc(int a, int b, int h){
		area = a*b*h;
	}
	
	double getArea() {
		return area;
	}
}

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수가 1(원의 면적), 2(사각형의 넓이), 3(사각형의 부피) 
		
		if(args.length == 1) { // 1
			Calc apple1 = new Calc(Integer.parseInt(args[0])); // int r
			System.out.println("원의 넓이 : "+apple1.getArea());
		}
		else if(args.length == 2) { // 2
			Calc apple2 = new Calc(Integer.parseInt(args[0]), Integer.parseInt(args[1])); // int a, int b
			System.out.println("사각형의 넓이 : "+(int)apple2.getArea());
		}
		else if(args.length == 3) { // 3
			Calc apple3 = new Calc(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])); // int a, int b , int h
			System.out.println("사각형의 부피 : "+(int)apple3.getArea());
		}
		
	}

}
