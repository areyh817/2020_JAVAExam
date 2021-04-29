package TEST;
class Student{
	String name;
	int grade;
	static int count = 0;
	
	public Student() {
		count++;
	}
}

public class StaticVariExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kim = new Student(); // kim 按眉 积己
		Student jang = new Student(); // jang 按眉 积己
		Student bak = new Student(); // bak 按眉 积己
		
		System.out.println("积己等 切积 按眉 荐绰 "+Student.count+"涝聪促.");

	}

}
