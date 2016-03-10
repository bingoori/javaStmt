package bank2;

public class BankServiceImpl2 implements BankService2{
//비즈니스로직에 해당되며 컨트롤러의 역할을 한다 실제 은닉화가 되는 기준점
//기능에 대한 실제 로직이 들어가는 부분
	private AccountBean2 account;
	@Override
	public String openAccount(String name, int password) {
		//계좌를 개설 한다.
		account = new AccountBean2(name, password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		account.setMoney(account.getMoney()+money);
		return account.getMoney()+"원";
	}

	@Override
	public String withdraw(int money) {
		String result = "";
		if((account.getMoney()-money)<0)
		{
			result = "잔액이 부족 합니다.";
		}else
		{
			result = money+"가 출금 되었습니다.";
			account.setMoney(account.getMoney()-money);
		}
		return result;
	}

	@Override
	public int findMoney() {
		return account.getMoney();
	}

}
