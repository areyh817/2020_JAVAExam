package CLASS;
// import java.util.Scanner;
class intSum {
	private int sum;
	
	intSum(int a, int b){ // 1
		// sum = a + b;
		this(a, b, 1, 1);
	}
	intSum(int a, int b, int c) { // 2
		// sum = a + b + c;
		this(a, b, c, 1);
	}
	intSum(int a, int b, int c, int d) { // 3
		sum = a * b * c * d;
	}
	int getSum() {
		return sum;
	}
}

public class intSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		if(args.length == 2) {
			intSum sum1 = new intSum(Integer.parseInt(args[0]), Integer.parseInt(args[1])); // 1
			System.out.println(sum1.getSum());
		}
		else if(args.length == 3) {
			intSum sum2 = new intSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])); // 2
			System.out.println(sum2.getSum());
		}
		else if(args.length == 4) {
			intSum sum3 = new intSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])); // 3
			System.out.println(sum3.getSum());
		}
		
		
		
		
		
	}

}
