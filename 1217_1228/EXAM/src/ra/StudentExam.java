package ra;

class Student{
	private String name; 
	private int grade;
	public Student() {
}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int grade) {
		this(name);
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("학생의 이름은 "+this.name+"이고, "+this.grade+"학년입니다.");
	}
	void setGrade(int grade) {
		this.grade = grade;
	}

public class StudentExam {
	public static void main(String args[]) {
		Student kim = new Student("김현우"); 
		kim.setGrade(2); // kim.grade = 2; 직접 접근이 가능
		Student jang = new Student("장민재", 3);
		kim.print(); 
		jang.print();
	}
}

}