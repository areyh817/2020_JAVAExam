package Class_Object;

class person{
	// 멤버 변수 3개 멤버 메서드 3개
	String name;
	private int age;
	String job;
	
	void eat() {
		
	}
	
	void sleep() {
		
	}
	
	void talk() {
		System.out.println(name+"가 말한다");
		
	}
	
	void print() {
		System.out.println(name+"의 나이는 "+age+"살입니다.");
	}
	
	void SetAge(int age) {
		this.age = age;
		
	}
}
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person hong = new person();
		person hong1 = new person();
		
		hong.name = "홍길동";
		hong.SetAge(15);
		// System.out.println(hong.name+"의 나이는 "+hong.age+"살입니다."); // 홍길동의 나이는 15입니다.
		hong.print();
		
		
		hong1.name = "배장화";
		hong1.SetAge(18);
		// System.out.println(hong1.name+"의 나이는 "+hong1.age+"살입니다."); // 배장화의 나이는 18살입니다.
		hong1.print();
		hong1 = hong;
		// System.out.println(hong1.name+"의 나이는 "+hong1.age+"살입니다."); // 배장화의 나이는 15살입니다.
		hong1.print();

		hong.talk();
		hong1.talk();
	}

}
