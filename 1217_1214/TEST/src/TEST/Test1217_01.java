// 1217 조혜라
// 문제 1번
package TEST;

public class Test1217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i = 1; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(j % 10 == 0) {
					System.out.println("\n");
					int num = i % 10;
					if(num / 3 == 0 || num / 6 == 0 || num / 9 == 0) System.out.println("X");
					else System.out.print(i+"\t");
				}

			}
		}*/
		
		for(int i = 1; i < 101; i++) {
			if(i % 10 == 0) {
				System.out.println("\n");
				int num = i % 10;
				if(num / 3 == 0 || num / 6 == 0 || num / 9 == 0) {
					System.out.print("X\t");
				}else {
					System.out.print(i+"\t");
				}
			}
		}
	}

}
