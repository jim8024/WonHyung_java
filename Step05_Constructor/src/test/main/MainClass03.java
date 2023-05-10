package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * MacBook객체를 생성해서 참조값을 mac1 이라는 지역변수에 담아보세요
		 * 
		 * 주의!
		 * -MacBook 클래스를 절대 수정하지 마세요
		 * MainClass03은 test.main 패키지에 있고
		 * cpu,memory,harddisk는 testmypac에 있기 대문에 4개 모두 import
		 */
		MacBook mac1=new MacBook(new Cpu(),new Memory(),new HardDisk());
		mac1.doGame();	
		MacBook mac2=new MacBook(null,null,null);
		mac2.doGame();
		
		
		
		
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		//생성자의 인자로 전달 할 값이 지역변수에 있는경우 지역변수를 참조해서 전달 할 수도 있다.
		MacBook mac3=new MacBook(c,m,h);
	}
}
