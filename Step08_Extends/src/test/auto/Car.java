package test.auto;

/*
 * -접근 지정자의 범위
 * public: 어디서나 접근 가능
 * protected: 동일한 패키지 혹은 상족 관계에서 자식에게 접근 가능
 * default: 동일한 패키지 안에서 접근 가능
 * private: 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 * 
 * -접근 지정자를 붙이는 위치
 * 1.클래스 선언 할때    //import 할지 말지만 결정하기 때문에 public or default 보통은 퍼블릭
 * 2.생성자
 * 3.필드
 * 4.메소드
 * 
 * 클래스는 default와 public 두가자 접근 지정자만 지정 가능하다
 * 접근 지정자를 생략한 것이 default 접근 지정자다
 */
	public class Car {
	//필드
	protected Engine engine;
	//Engine 객체를 생성인자로 전달 받는 생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴 수가 없어요");
			return;
		}
		System.out.println("달려요~");
	}
}






