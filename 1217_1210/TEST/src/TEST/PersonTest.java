package TEST;
class Person{
	private String LastName; // 성 (private)
	private String FirstName; // 이름 (private)
	
	Person(String LastName, String FirstName){ // 생성자
		this.LastName = LastName;
		this.FirstName = FirstName;
	}
	
	String getLastName() { // 성 반환
		return LastName;
	}

	String getFirstName() { // 이름 반환
		return FirstName;
	}
	
	int getLength() { // 이름 길이
		int LastNameCnt = LastName.length(); // 성 길이 계산
		int FirstNameCnt = FirstName.length(); // 이름 길이 계산
		return LastNameCnt + FirstNameCnt;
	}
}
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person kor = new Person("조", "혜라");
		Person eng = new Person("Jo", "Hyera");
		
		System.out.println("한글 : "+kor.getLastName()+kor.getFirstName()+"이고, 글자 수는 "+kor.getLength()+"글자 입니다.");
		System.out.println("영문 : "+eng.getFirstName()+" "+eng.getLastName()+"이고, 글자 수는 "+eng.getLength()+"글자 입니다.");
		
		
	}

}
