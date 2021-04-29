package Class_Object;
// OverLoding (중복정의) 매개변수의 갯수가 다르거나 type이 다르면 괜찮다
// OverRiding (재정의) and 상속에서만 쓴다.
class Shape{
	int radius;
	int width;
	int heigth;
	
	double area(int r){ // 원의 면적
		return radius * radius * 3.14;
	}
	double area(int w, int h){ // 삼각형
		return width * heigth / 2;
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
