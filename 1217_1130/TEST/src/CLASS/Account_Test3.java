package CLASS;
class Account{
	
	private String name;
	private int amount;
	
	Account(){ // 기본생성자
		name = "이름없음";
		amount = 0;
	} 
	Account(String name, int amount){  // 홍길동, 10000 
		 this.name = name; //setName(name);
		 this.amount = amount; // setAmount(amount);
	}
	void setName() {
		this.name = name;
	}
	void setAmount(int amount) {
		this.amount = amount;
	}
	String getName() {
		return name;
	}
	int getAmount() {
		return amount;
	}
}

public class Account_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		Account acc1 = new Account("홍길동", 10000);
		
		System.out.println(acc.getName()+" : "+acc.getAmount());
		System.out.println(acc1.getName()+" : "+acc1.getAmount());
	}

}
