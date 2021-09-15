package sec03.exam01_hashset;

public class Member {

	// 필드
	public String name;
	public int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
		return false;
		}
	}
	
	
	
	// 메소드
	
}
