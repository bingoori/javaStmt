package bank;

public class BankServiceImpl implements BankService {
	private AccountBean account;

	@Override
	public String openAccount(String name, int password) {
	account = new AccountBean(name, password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		account.setMoney(account.getMoney() + money);
		return money+"";
	}

	@Override
	public String withdraw(int money) {
		account.setMoney(account.getMoney() - money);
		return money +"";
	}

	@Override
	public int findMoney() {
		return account.getMoney();
	}





}
