package test.main;

import test.mypac.Myutill;

public class MainClass07 {
	public static void main(String[] args) {
		
		//메소드 안에서 발생하는 예외를 직접 처리한 draw()메소드 호출
		Myutill.draw();
		//메소드 안에서 발생하는 예외를 throws한 send() 메소드
		try {
			Myutill.send();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
