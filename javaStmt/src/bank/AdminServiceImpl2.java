package bank;

import java.util.Vector;

/**
 * @file : BankServiceImpl.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 10.
 * @story
 */
public class AdminServiceImpl2 implements AdminService2 {
	private AccountBean[] accountList; // 전체 계좌를 보관하는 객체
	private Vector<AccountBean> vAccoutList;
	private int count; // 전체 통장 계좌 수
	//인스턴스 변수는 바로 초기화 하지 않는다.
	public AdminServiceImpl2(int size) {
	accountList = new AccountBean[size];
	vAccoutList = new Vector<AccountBean>();
	}
	/**
	 * 전체 계좌 목록 출력
	*/
	@Override
	public Vector<AccountBean> getList() {		
		return vAccoutList;
	}
	/**
	 * 계좌 개설
	 */
	@Override
	public String openAccount(String name, int password) {
		
		AccountBean bean = new AccountBean(name, password);
		vAccoutList.add(bean);
		accountList[count] = bean;
		count++; //계좌를 개설할 때마다 카운트를 1씩 증가 시킨다.
		return bean.toString();
	}
	/**
	 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
	 * */
	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		/**
		 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		 */
		AccountBean temp = new AccountBean();
		 for (int i = 0; i < count; i++) {
			 if(accountList[i].getAccountNo() == accountNo)
			 {
				 temp = accountList[i];
			 }
			
		}
		return temp;
	}
	/**
	 * 이름으로 계좌 조회(복수개의 결과가능)
	 * */
	@Override
	public AccountBean[] findAccountsByName(String name) {
		/**
		 * 이름으로 계좌 조회(복수개의 결과가능)
		 */
		AccountBean[] tempList = new AccountBean[this.countByName(name)];
		int tempCount=0;
		System.out.println(tempList.length);
		for (int i = 0; i < count; i++) {
			if(accountList[i].getName().equals(name)){
				tempList[tempCount++] = accountList[i];
			}
		}
		return tempList;
	}

	/**
	 * 계좌 해지
	 * */
	@Override
	public String closeAccount(int accountNo) {
		/**
		 * 계좌 해지
		 */
		for (int i = 0; i < count; i++) {
			
			if(accountList[i].getAccountNo() == accountNo)
			{
				accountList[i] =accountList[count-1];
				accountList[count-1] = null;
				count--;
				break;
			}
		}
		return "해지 완료";
	}
	/**
	 * 전체 계좌수 조회
	 * */
	@Override
	public int countAll() {
		/**
		 * 전체 계좌수 조회
		 */
		return count;
	}
	/**
	 * 해당 이름에 맞는 계좌 수 조회
	 * */
	@Override
	public int countByName(String name) {
		int UserCount = 0;
		/**
		 * 해당 이름에 맞는 계좌 수 조회
		 */
		for (int i = 0; i < count; i++) {
			if(accountList[i].getName().equals(name)){
				UserCount++;
			}
		}
		return UserCount;
	}


}
