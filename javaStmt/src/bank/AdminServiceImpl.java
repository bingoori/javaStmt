package bank;

/**
 * @file : BankServiceImpl.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 10.
 * @story
 */
public class AdminServiceImpl implements AdminService {
	private AccountBean[] accountList; // 전체 계좌를 보관하는 객체
	private int count; // 전체 통장 계좌 수
	//인스턴스 변수는 바로 초기화 하지 않는다.
	public AdminServiceImpl(int size) {
		// accountList 를 초기화
		accountList = new AccountBean[size];
	}
	@Override
	public String openAccount(String name, int password) {
		/**
		 * 계좌 개설
		 */
		AccountBean bean = new AccountBean(name, password);
		count++; //계좌를 개설할 때마다 카운트를 1씩 증가 시킨다.
		return bean.toString();
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		/**
		 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		 */
		AccountBean temp = new AccountBean();
		 for (int i = 0; i < count; i++) {
			 if(true)
			 {
				 temp = null;
			 }
			
		}
		return temp;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		/**
		 * 이름으로 계좌 조회(복수개의 결과가능)
		 */
		AccountBean[] tempList = new AccountBean[this.countByName(name)];
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		/**
		 * 계좌 해지
		 */
		return null;
	}

	@Override
	public int countAll() {
		/**
		 * 전체 계좌수 조회
		 */
		return count;
	}

	@Override
	public int countByName(String name) {
		/**
		 * 해당 이름에 맞는 계좌 수 조회
		 */
		
		return 0;
	}

}
