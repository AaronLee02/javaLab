package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; 		// 인터페이스 변수 = 구현객체;
		Searchable searchable = tv; // 인터페이스 변수 = 구현객체;
	}
}
