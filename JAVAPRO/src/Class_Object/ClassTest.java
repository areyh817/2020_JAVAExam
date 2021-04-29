package Class_Object;

class Car{
	String name;   // public
	String color; // public
	private int createYear;
	Car(String name){ // Constructor 생성자
		System.out.println(name+"객체 생성");
		this.name = name;
	}
	Car(String name, String color){ // Constructor 생성자
		System.out.println(name+"객체 생성");
		this.name = name;
		this.color = color;
	}
	void carFront() {
		System.out.println(name+"전진합니다.");
	}
	void carBack() {
		System.out.println(name+"후진합니다.");
	}
	int carCreateYear() {
		return createYear;
	}
	void setCY(int createYear){
		this.createYear = createYear;
	}
}
public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car("Soso");
		Car tico = new Car("Mama");
		Car matiz = new Car("Titi");
		Car matiz1 = new Car("QQQQ", "red");
		//sonata.name = "Soso";
		sonata.carFront();
		//matiz.name = "Mama";
		matiz.carBack();
		//tico.name = "Titi";
		tico.setCY(1991); // tico.createYear = createYear;
		System.out.println(tico.carCreateYear());

		

	}

}
