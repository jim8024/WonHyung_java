package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass {
	public static void main(String[] args) {
		//fruit box 객체를 생성해서 참조값을 box라는 이름의 지역변수에 담아보세요
		FruitBox<Apple> box=new FruitBox<Apple>();
		//box에 담긴 참조값을 이용해서 pack()메소드를 호출해보세요
		box.pack(new Apple());
		//box에 담긴 참조값을 이용해서 unpack()메소드를 호출해보세요 리턴값을 fruit라는 지역 변수에 담아보세요
		Apple fruit=box.unpack();
		
		
		
		//여기서 생성한 박스에 melon을 담을 수 있을지 확인
		FruitBox<Melon> box2=new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon fruit2=box2.unpack();
		
		//orange
		FruitBox<Orange> box3=new FruitBox<>();//객체 생성시에는 제너릭 클래스 생략 가능
		box3.pack(new Orange());
		Orange fruit3=box3.unpack();
		
		
		
	}
}
