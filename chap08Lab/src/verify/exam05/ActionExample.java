package verify.exam05;

public class ActionExample {
	public static void main(String[] args) {
		
		// 작성 위치
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}
}

		//실행 결과
		//복사를 합니다.