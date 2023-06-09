package test.mypac;

/*
 * 클ㄹ스 안에서 사용하는 특정 type을 고정하지 않고
 * 
 * 클래스를 사용하는 시점에 type을 정할 수 있다.
 * 
 * -아래 선언한 T는 마음데로 단어를 정할 수 있다
 * 	보통 type이라는 의미에서 T라고 많이 칭한다.
 * -T 포괄 클래스(Generic Class)라고 한다.
 */



//가상의 과일 박스
public class FruitBox<T> {
	//필드
	private T item;
	
	//과일을 포장하는 메소드
	public void pack(T item) {
		this.item=item;
	}
	//과일을 리턴하는 메소드
	public T unpack() {
		return item;
	}
}
