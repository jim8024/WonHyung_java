package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		AndroidPhone p1=new AndroidPhone();
		p1.call();			//Phone 기능
		p1.mobileCall();    //HandPhone 기능
		p1.takePicture();   //HandPhone 기능
		p1.doInternet();	//AndroidPhone 기능	
		p1.showPlatform();	//AndroidPhone 기능
		
		
	}
}
