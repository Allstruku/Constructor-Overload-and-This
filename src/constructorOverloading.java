// 메소드과 마찬가지로 생성자도 overloading이 가능하다. 매개변수, 데이터 타입의 순서 매개변수의 타입만 다르다면 
public class constructorOverloading {
	int number;
	String name;
	
	public constructorOverloading () {
		this(1234, "No name");
	}
	
	public constructorOverloading (int number, String name) {
		this.number = number;
		this.name = name;
	}
	// 일반적으로 쓰이는 생성자로 매개변수 number와 name을 받는다
	
	public constructorOverloading (int number) {
		this.number = number;
	}
	// 윗 생성자와는 다르게 number 매개변수만 받는다
	
	public constructorOverloading (String name) {
		this.name = name;
	}
	// 또, 윗 생성자와는 다르게 name 매개변수만 받는다 
	
//	public constructorOverloading () {
//	}
	// 생성자를 프로그래머가 직접 선언하게 된다면 compiler가 원래 자동으로 만들어주던 기본 생성자는 만들어지지 않는다 
	// 그렇기에 프로그래머가 직접 매개변수가 없는 기본 생성자를 만들어야 한다 
	
//	public constructorOverloading () {
//		this.name = "No name";
//		this.number = 1234;
//	}
	// 매개변수가 없더라도 필드를 초기화(대입) 시킬 수는 있다. 윗 상황처럼 할 수는 있지만, 벌써 만들어진 1번째 생성자와 코드가 겹친다
	// 그렇기에 윗처럼 말고 밑에처럼 this keyword를 사용하면 된다. this keyword를 사용하게 된다면 알맞는 생성자를 호출하여 값을 필드에 대입한

	public static void main(String[] args) {
		constructorOverloading c1 = new constructorOverloading(12, "Jack");
		System.out.println(c1.name);
		System.out.println(c1.number);

		constructorOverloading c2 = new constructorOverloading(15);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		constructorOverloading c3 = new constructorOverloading("Katie");
		System.out.println(c3.name);
		System.out.println(c3.number);
		
		constructorOverloading c4 = new constructorOverloading();
		System.out.println(c4.name);
		System.out.println(c4.number);
	}
}
