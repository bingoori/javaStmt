package member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService {

	private HashMap<String, MemberBean> map; // Bean객체를 키값으로 지정
	private MemberBean memberBean;

	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}

	@Override
	public String join(MemberBean member) {
		// 회원가입
		map.put(member.getId(), member);
		return member.getId();
	}

	@Override
	public boolean login(String id, String password) {
		boolean result = true;
		// 로그인
		// 아이디가 존재하지 않아서 실패한 경우와 비번이 틀려서 경우에 따라서
		// 메시지를 전달해줘야 함
		if (map.containsKey(id) == false || !map.get(id).getPassword().equals(password)) {
			result = false;
		}

		return result;
	}

	@Override
	public MemberBean update(String id,String password,int birth,String addr) {
		// 회원 수정
		MemberBean tempbean = new MemberBean();
		tempbean = map.get(id);
		tempbean.setPassword(password);
		tempbean.setBirth(birth);
		tempbean.setAddr(addr);
		
		return tempbean;
	}

	@Override
	public String remove(String id) {
		// 회원 삭제
		map.remove(id);
		return "회원 탈퇴 하였습니다";
	}

	@Override
	public MemberBean detail(String id) {

		return map.get(id);
	}

}