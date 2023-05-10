package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		//아래에 있는 use weapon 메소드를 호출 하려면 참조값이 필요하다
		useWeapon(new MyWeapon());
		
		Weapon w1=new Weapon() {
			public void attack() {
				System.out.println("아무나 공격하자");
			}            					//클래스이다 이름이 없는,,,, 익명의 클래스 입니다.
											//extends Weapon 한 클래스이다. 자동으로 								//익명의 로칼 이너 클래스
		};
		useWeapon(w1); //변수 만들어서 하기
		
		useWeapon(new Weapon() {    //직접 만들어서 하기

			@Override
			public void attack() {
				System.out.println("직접 생성해서 공격!");
				
			}
			
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
