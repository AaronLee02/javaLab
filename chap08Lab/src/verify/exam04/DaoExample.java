package verify.exam04;

public class DaoExample {
	// Ŭ������ �������
	// �ʵ�
	// ������
	
	// �żҵ�
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// DataAccessObject dao = new OracleDao(); // �ڵ�����ȯ
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

//���� ���
//Oracle DB���� �˻�
//Oracle DB�� ����
//Oracle DB�� ����
//Oracle DB���� ����
//MySql DB���� �˻�
//MySql DB�� ����
//MySql DB�� ����
//MySql DB���� ����