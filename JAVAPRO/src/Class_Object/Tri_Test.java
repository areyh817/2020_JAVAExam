package Class_Object;

class Triangle{
	int base;
	int height;
}

public class Tri_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri1 = new Triangle();
		tri1.base = (int)(Math.random()*11);
		tri1.height = (int)(Math.random()*11);
		System.out.println(tri1.base * tri1.height / 2);

	}

}