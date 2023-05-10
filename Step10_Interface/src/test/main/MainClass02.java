package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.TvRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1=new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		//직접 클래스를 testmypac 패키지에 파일로 만들어서 useRemocon 메소드를 여기서 호출 해보세요
		TvRemocon r4=new TvRemocon();
		useRemocon(r4);
		//나만의 기능도 호출
		r4.reserve();
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//만일 여기서 reserve() 메소드를 사용하고 싶으면 방법이 없을까?
		//TvRemocon r2=(TvRemocon) r;  //이순간 tv remocon 객체만 전달 가능
		//r2.reserve();
	}
}








