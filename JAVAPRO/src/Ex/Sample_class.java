package Ex;
class Ex_class{
	String car_name;
	private int size;
	
	void Setsize(int size) {
		this.size = size;
	}
	
	int Getsize() {
		return size;
	}
	
}
public class Sample_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_class ex = new Ex_class();
		ex.car_name = "그랜져";
		ex.Setsize(2500);
		System.out.println("차종 : "+ex.car_name+"크기 : "+ex.Getsize());
	}

}
