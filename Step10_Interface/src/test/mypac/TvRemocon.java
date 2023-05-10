package test.mypac;

public class TvRemocon implements Remocon{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("tv 채널을 올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("tv 채널을 내려요");
	}
	//그런데,,,, 나는 내가 사용할 편리한 메소드를 하나 더 만들고 싶다,,
	
	public void reserve() {
		System.out.println("전원 off를 예약합니다");
	}
}
