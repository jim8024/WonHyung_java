package test.main;
/*
 * [기본 data type의 참조 data type]
 * 
 * byte   : Byte
 * shot   : Short
 * int    : Integer
 * log    : Long
 * 
 * float  : Float
 * double : Double
 * 
 * char   : Character
 * boolean: Boolean
 *
 *-때로는 기본데이터 type의 참조 데이터 type이 필요할 때가 있다.
 *-기본 데이터 type 을 객체에 포장(boxing)하는 형태이다.
 *-boxing 과 unboxing 은 자동으로 되기때문에 프로그래머가 신경쓸 필요는없다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 타입 num1
		int num1=10;
		//Integer num2=new Integer(10);
		//참조 데이터 타입 num2
		Integer num2=(10);
		//참조 데이터 타입 이지만 기본 데이터타입 처럼 사용가능
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		int result4=Integer.parseInt("15612");//문자를 숫자로 바꿔줌
		
	}
}



















