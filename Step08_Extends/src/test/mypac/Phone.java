package test.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone {
	//생성자
	public Phone() {    //리턴타입이 없고 클래스와 이름이 같다.
		System.out.println("Phone 생성자 호출됨");
	}
	
	//전화 거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
