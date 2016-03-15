package grade;

import java.util.Vector;

/**
 * CRUD 
 *  C : Create 생성
 *  R : Read   조회
 *  U : Update 수정
 *  D : Delete 삭제
 *@package : grade
 *@file : GradeService.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 14.
 *@story 속성은 감추고 기능은 오픈한다.
 */
public interface GradeService {
	// 성적표 등록  C
	public void input(GradeBean gradeBean); //기능은 추상화하고 속성은 추상화하지 않는다.
	// 성적표 리스트 출력 R
	public Vector<GradeBean> getList();
	// 성적표 조회(학번) R
	public void getGradeByHak();
	// 성적표 조회(이름) R
	public void getGradesByName();
	// 성적표 수정 U
	public void update();
	// 성적표 삭제 D
	public void delete();
	// R 카운트 조회
	public void getCount();
	// R 이름조회시 카운트 조회
	public void getCountByName();
	
	
}
