package TEST;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = new int [100];
		int [] cnt = new int [50];
		

		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*50)+1; // random 1 ~ 50까지
			cnt[num[i]-1]++;
		}
		int max = num[0]; // 최대값 변수
		int min = num[0]; // 최소값 변수
		
		for(int i = 0; i < num.length; i++) { // 최대값 최솟값 계산
			if(max < num[i]) max = num[i]; // 최대값
			if(min > num[i]) min = num[i]; // 최소값
		}
		
		int b = 0;
			
        for (int i = 0; i < cnt.length; i++){ // 최빈값 계산
        	if(b < cnt[i]){ // cnt[i]가 b보다 클 때 b에 계속 저장 
                b = cnt[i];  // 크면 클 수록 b의 값이 바뀌게 됨
            }        
        }      
        
        for(int i = 0; i < num.length; i++) {
        	if(i % 10 == 0) {
        		System.out.println("\t");
        	}
        	System.out.print(num[i]+" ");
        }
			System.out.println("\t");
			System.out.println("최대값 : "+max+"  최솟값 : "+min); 
	        for (int i = 0; i < cnt.length; i++) {
				if(b == cnt[i]) System.out.println("가장 빈도수가 높은 수는 "+(i+1)+"로 "+cnt[i]+"번 발생");
			}
			
	}

}
