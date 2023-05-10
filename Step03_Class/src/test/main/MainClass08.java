package test.main;

import test.mypac.Member;

public class MainClass08 {
	public static void main(String[] args) {
		//설계한 Member 클래스로 객체를 생성해서 mem1이라는 지역변수에 담아보세요
		Member mem1=new Member();
		//mem1에 저장되어 있는 참조값을 이용해서 회원번호 1을 객체에 저장해보세요
		mem1.num=1;
		//mem1에 저장되어 있는 참조값을 이용해서 회원의 이름 김구라를 객체에 저장해보세요
		mem1.name="김구라";
		//mem1에 저장되어 있는 참조값을 이용해서 회원주소 노량진을 객체에 저장해보세요
		mem1.addr="노량진";
		mem1.showInfo();
	}
}
