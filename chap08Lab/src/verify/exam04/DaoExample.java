package verify.exam04;

public class DaoExample {
	// 클래스의 구성멤버
	// 필드
	// 생성자
	
	// 매소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// DataAccessObject dao = new OracleDao(); // 자동형변환
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

//실행 결과
//Oracle DB에서 검색
//Oracle DB에 삽입
//Oracle DB를 수정
//Oracle DB에서 삭제
//MySql DB에서 검색
//MySql DB에 삽입
//MySql DB를 수정
//MySql DB에서 삭제