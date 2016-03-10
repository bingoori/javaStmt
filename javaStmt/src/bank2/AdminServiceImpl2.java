package bank2;

import bank2.AccountBean2;

public class AdminServiceImpl2 implements AdminService2 {
	private AccountBean2[] accountList; // 전체 계좌를 보관하는 객체
	private int count; // 전체 통장 개수
	// 인스턴스 변수를 바로 초기화 하지않는다.

	public AdminServiceImpl2() {
		accountList = new AccountBean2[10];
	}

	@Override
	public String openAccount(String name, int password) {
		AccountBean2 bean = new AccountBean2(name,password);
		accountList[count] = bean;
		count++;
		return bean.toString();
	}

	@Override
	public AccountBean2 findAccountByAccountNo(int accountNo) {
		/**
		 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		 */
		AccountBean2 temp = new AccountBean2();
		for (int i = 0; i < count; i++) {
			if(accountList[i].getAccountNo() == accountNo)
			{
				temp = accountList[i];
			}
		}
		return temp;
	}

	@Override
	public AccountBean2[] findAccountsByName(String name) {
		/**
		 * 이름으로 계좌 조회(복수개의 결과가능)
		 */
		int tempCount = 0;
		AccountBean2[] tempList = new AccountBean2[this.countByName(name)];
		for (int i = 0; i < count; i++) {
			if(accountList[i].getName().equals(name))
			{
				tempList[tempCount++] = accountList[i];
			}
		}
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		for (int i = 0; i < count; i++) {
			if(accountList[i].getAccountNo() == accountNo)
			{
				accountList[i] = accountList[count-1];
				accountList[count-1] = null;
				count--;
				break;
			}
		}
		return "해지 완료";
	}

	@Override
	public int countAll() {
		//전체 계좌수
		return count;
	}

	@Override
	public int countByName(String name) {
		//이름에 해당하는 계좌수
		int UserCount = 0;
		for(int i = 0 ; i < count;i++)
		{
			if(accountList[i].getName().equals(name))
			{
				UserCount++;
			}
		}
		return UserCount;
	}

}
