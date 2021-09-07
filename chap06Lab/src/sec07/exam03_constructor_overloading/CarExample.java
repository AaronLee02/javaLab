package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.maxSpeed: "+car1.maxSpeed);
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		
		
	}

}
