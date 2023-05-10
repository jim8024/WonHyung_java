package test.mypac;

public class HandPhone extends Phone{   //Phone class를 상속 받아서 만들겠다.
	
	public HandPhone() {//어떤 클래스도 상속받지 않으면 자동으로 extends Object가 된가
		System.out.println("HandPhone 생성자 호출됨");
	}
	//메소드
	public void mobileCall(){
		System.out.println("이동중에 전화를 걸어요");
	}
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
	
}
