package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서 
		 * 그 참조값을 p1이라는 이름의 지역변수 담기
		 */
		HandPhone p1=new HandPhone();
		/*
		 * 핸드폰 클래스의 생성자를 호출해서 객체를 생성했더니
		 * 폰 클래스의 생성자도 호출 되는 걸 알 수가 있다.
		 * 
		 * 따라서 핸드폰 객체도 생성되고 폰 객체도 같이 생성되었다는 걸 유추 할 수 있다.
		 * 
		 * 두 객체가 같은 사물함에 들어간다
		 * 
		 */
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
}
