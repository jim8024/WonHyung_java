package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 use Remocon 메소드를 호출하기 위에서는 Remocon 인터페이스
		//type의 참조값이 필요하다. 익명의 로컬 인클래스를 이용하여 remocon타입의 참조값을 만들어내서 호풀해보자
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("온도를 올려요");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("온도를 내려요");
			}
		};
		
		
		
		//2가지 방법
		/*
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				
			}
		});
		*/

	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
