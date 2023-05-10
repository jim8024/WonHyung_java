package test.mypac;

/*
 * 인터페이스를 implements 하면 인터페이스에 저의 되어 있는
 * 모든 추상 메소드를 오버라이이드 해야한다(강제)
 */

public class MyRemocon implements Remocon{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("채널을 올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("채널을 내려요");
	}
	
}	
