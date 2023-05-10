package test.main;


import test.mypac.MyWeapon;
import test.mypac.Weapon;

/*
 * 추상 클래스 Abstract Class
 * 
 * -Class 예약 앞에 abstract를 명시해서 클래스를 정의 한다.
 * -형태만 정의 되고 실제 구현은 되지 않는 메소드가 존재할 수 있다.
 * -형태만 정의 된 메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의 한다
 * -생성자는 존재하지만 단독으로 객체 생성은 불가하다
 * -추상클래스는 타입의 참조값이 필요하다면 추상클래스를 상속받은 자식클래스를 정의해서 객체를 생성한다
 * -추상클래스를 상송받은 자식클래스는 부모의 추상메소드를 모두 오러바이드 해야한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//weapon type의 참조값을 담을 지역변수 w1만들기
		Weapon w1=new MyWeapon();
		w1.prepare();
		w1.attack();
	}
}
