package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;


public class MainClass03 {
	public static void main(String[] args) {
		//Zoo 객체를 생성해서 참조값을 z1이라는 변수에 담아보세요
		Zoo z1= new Zoo();
		//z1안에 있는 참조값을 사용해서 getMonkey메소드를 호출 후 리턴되는 값을 m1에 담아보세요
		Monkey m1=z1.getMonkey();
		//리턴된 몽키 ㅐㄱ체의 say()메소드를 호출해보기
		m1.say();
		
		Zoo z2=new Zoo();
		Tiger t1=z2.getTiger();
		t1.say();
	}	
}
