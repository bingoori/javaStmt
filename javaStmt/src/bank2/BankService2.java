package bank2;

public interface BankService2 {
	//비즈니스 로직에 해당하며 사용할 기능들을 기술한다.
	/**
	 * 계좌 개설
	 */
	public String openAccount(String name,int password);
	/**
	 * 입금 
	 * */
	public String deposit(int money);
	/**
	 * 출금
	 * */
	public String withdraw(int money);
	/**
	 * 잔액 조회
	 * */
	public int findMoney();
}
