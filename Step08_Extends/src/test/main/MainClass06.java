package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//인터넷이 잘 안됨
		HandPhone p1=new HandPhone();
		
		//나도 안드로이드 폰 갖고 싶어
		AndroidPhone p2=(AndroidPhone)p1;//class cast Exception  발생
		
		p2.doInternet();
	}
}
