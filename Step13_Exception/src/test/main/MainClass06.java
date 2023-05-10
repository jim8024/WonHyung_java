package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum=ran.nextInt(5);
		
		if(ranNum==4) {
			throw new WowException("놀랍네 이거 ㄷㄷ");
			
		}
		System.out.println("main메소드가 종료 됩니다");
	}
}
