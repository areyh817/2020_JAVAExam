package Class_Object;
class Square{
	int height; // 세로
	private int base; // 가로
	
	int SagakSagak() {
		return height * base;
		
	}
	
	int S3agak() {
		return height+height+base+base;
	}
	
	void setWidth(int Width){
		base = Width;
	}
	
	int getWidth() {
		return base;
	}

}
public class Square_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square Sagak = new Square();
		
		Sagak.height = ((int)(Math.random()*36+10));
		Sagak.setWidth((int)(Math.random()*36+10));
		System.out.println("가로 : "+Sagak.getWidth());
		System.out.println("세로 : "+Sagak.height);
		System.out.println("넓이: "+Sagak.SagakSagak());
		System.out.println("둘레 : "+Sagak.S3agak());

	}

} 