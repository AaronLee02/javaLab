package sec02.exam01_interface_declaration;

public interface RemoteControl {

	// 인터페이스의 구성멤버
	// 상수
	public static final int MAX_VOLUME = 10; // public static final 생략가능
	int MIN_VOLUME = 10;
		
	// 추상 메소드
	abstract void turnOn(); // abstract 생략가능
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
}
