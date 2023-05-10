package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드 앞에 선언하는 데이터 타입은
 * 
 * 그안에 들어있는 참조값의 사용 설명서 라고 생각하면 된다
 * 
 * 그렇기 때문에 그 지역변수나 필드에 .을 찍으면 사용 설명서에 명시된 기능만 사용 할 수 있다.
 * 
 * 자바의 모든 객체는 다형성을 자질 수 있다.
 * 
 * 다형성은 타입이 여려개라는 의미이다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		//핸드폰 객체 생성해서 나온 참조값을 핸드폰 타입 지역변수 p1에 저장
		HandPhone p1 =new HandPhone();
		//폰 타입 지역변수 p2생성
		Phone p2=new HandPhone();
		//여러가지 타입으로 받을 수 있다. 다형성
		 //한드폰 객체를 생성해서 오브젝트 타입변수 p3에 담기
		Object p3=new HandPhone();
		
	}
}
