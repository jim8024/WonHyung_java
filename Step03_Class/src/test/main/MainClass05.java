package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.name="소나타";
		car1.price=1000;
		car1.drive();
		/*
		 * 아래의 매소드를 호출 했을때
		 * 
		 * 차의 이름은 소나타이고 가격은 1000만원 입니다.
		 * 
		 * 가 출력되도록 Car class의 showInfo() 매소드 내용을 작성해보세요.
		 */
		car1.showInfo();
	}
}
