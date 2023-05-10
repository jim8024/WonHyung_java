package test.mypac;
/*
 * 떄로는 우리가 직접 예외클래스를 정의하고
 * 
 * 필요한 시점 혹은 이벤트가 발생했을떄 예외를 throw해야할 때가 있다.
 * 
 * 예외 클래스는 RunTimeException을 상속받아 만들면 된다.
 */
public class WowException extends RuntimeException{
	//예외 메세지를 생성자의 인자로 전달 받아서 부모생성자에 전달하는 생성자를 만들면 편하다.
	
	public WowException(String msg) {
		super(msg);
	}
}
