package TEST;

class employee{
	int age;
	String name;
	static int empnum;
	
	employee() {
		System.out.println("사원 객체 생성 : "+ ++empnum);
	}
	
	
}
public class exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		employee hong = new employee();
		employee kim = new employee();

	}

}
