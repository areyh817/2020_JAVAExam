package Class_Object;


class Student{
	String name;
	int grade;
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kim = new Student();
		kim.name = "김현우";
		kim.grade = 2;
		
		System.out.println("학생의 이름은 "+kim.name+"이고, "+kim.grade+"학년입니다.");
	}

}
