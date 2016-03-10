package bank2;

public class AccountBean2 {
	//속성 Bean 클래스 비즈니스로직이며 속성에 처리(Model)
	private int accountNo; //계좌번호
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	private String name; //계좌주
	private int password; //계좌 비밀번호
	private int money; //계좌 총액
	public static final String BANK_NAME = "한빛뱅크";
	//상수는 회사의 로고를 상징하므로 pricate 접근제어를 막지 않는다.
	//또한 이미 지정되고 변하지 않는 수 이므로 get,set으로 은닉화처리를 하지 않는다.
	
	/**
	 * 생성자를 만드시오
	 * 단, 통장을 만듦과 동시에 은행이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
	 * 계좌 주인의 이름은 새겨지며 비번도 설정합니다
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
	 * */
	public AccountBean2() {}
	public AccountBean2(String name,int password) {
		this.accountNo = (int)(Math.random()*999998)+1;
		this.name = name;
		this.password = password;
		this.money = 0;
	}
	@Override
	public String toString() {
		return "계좌정보 [계좌번호=" + accountNo + ", 이름=" + name + ", 비밀번호=" + password + ", 잔액=" + money
				+ "]";
	}
	

}
