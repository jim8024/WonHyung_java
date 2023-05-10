package test.mypac;

public class MyWeapon extends Weapon{
	
	//부모클래스의 추상 메소드를 반드시 오버라이드 해야한다.
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		//어딜 공격할지 프로젝트에 상황에 따라 만든다
		System.out.println("지상을 공격해요!");
	}

}
