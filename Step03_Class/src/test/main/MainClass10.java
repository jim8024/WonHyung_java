package test.main;

import test.mypac.Rec;

/*
 * test.mypac 페키지에 클래스를 하나 만들어 보세여
 * 
 * -사각형의 폭,높이 ,를 필드에 저장할 수 있어야 합니다
 * -필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드 가지고 있어야 합니다.
 * -필드와 메소드 모두 non static으로 만드세요
 * -클래스명,필드명 ,메소드명은 여러분이 마음대로 정해보세요
 */
public class MainClass10 {
	public static void main(String[] args) {
		Rec r1=new Rec();
		r1.height=15;
		r1.width=10;
		r1.area();
	}
}	
