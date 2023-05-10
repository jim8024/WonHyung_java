package test.main;
/*
 * [java 기본 데이터 type]
 * 
 * 2.논리형 (boolean)
 * 
 * -true,false 두가지 값 중 하나이다.
 * -true,false를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
 * -참 과 거짓을 나타내는 데이터 type
 */
public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		
		if(isRun) {
			System.out.println("달려요");
		}
		//비교연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리연산의 결과로 얻어진 boolean값 담기
		boolean result=true||false;
		//boolean result=false; 한번 선언된 변수는 다시 선언 할 수 없다. 
		result=false;//같은 타입인 경우 다른 값 대입가능.
		//다른 타입 값은 변수에 담을 수 없다.
		//result=10;
	}
}
