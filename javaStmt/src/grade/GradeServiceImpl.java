package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 * private String name; private int hak, java, sql, jsp, spring;
	 */

	// 멤버 필드
	// 속성을 모아놓은곳 (Bean)
	private Vector<GradeBean> gradeList;

	// Vector<GradeBean> gradeList = new Vector<GradeBean>(); //인스턴스변수
	public GradeServiceImpl() {
		gradeList = new Vector<GradeBean>(); // 인스턴스 변수 초기화
	}
	// 메서드 내부에 위치하면 참조변수(공유를 안하므로)
	// 멤버 메소드 에어리어
	// 기능을 모아놓은곳(Service)

	@Override
	public void input(GradeBean gradeBean) {
		// 성적표 등록 C
		gradeList.add(gradeBean);
	}

	@Override
	public Vector<GradeBean> getList() {
		// 성적표 리스트 출력 R
		Vector<GradeBean> gradeList = new Vector<GradeBean>();
		
		return gradeList;

	}

	@Override
	public void getGradeByHak() {
		// 성적표 조회(학번) R

	}

	@Override
	public void getGradesByName() {
		// 성적표 조회(이름) R

	}

	@Override
	public void update() {
		// 성적표 수정 U

	}

	@Override
	public void delete() {
		// 성적표 삭제 D

	}

	@Override
	public void getCount() {
		// R 카운트 조회

	}

	@Override
	public void getCountByName() {
		// R 이름조회시 카운트 조회

	}

}
