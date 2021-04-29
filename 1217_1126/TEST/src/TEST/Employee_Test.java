package TEST;

class Employee{
	String name;
	int age;
	static int Empnum; // 클래스 변수
	
	Employee(){
		System.out.println("사원 객체 생성 : "+ ++Empnum);
	}
	
}

public class Employee_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee hong = new Employee(); 
		Employee kim = new Employee();
		Employee min = new Employee();
		Employee jung = new Employee();

	}

}
