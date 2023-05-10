package test.main;
/*
 * 3.비교 연산자 테스트
 * 	비교연산의 결과는 boolean타입으로 리턴해준다
 *  ==,!=,>,>=,<,<=
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1=10==10;
		boolean result2=10!=10;
		boolean result3=10>10;
		boolean result4=10>=10;
		boolean result5=10<10;
		boolean result6=10<=10;
		
		//String type변수 name에 null값 대입하기
		String name=null;
		
		//null인지 아닌지 비교가 가능하다
		boolean result7= name ==null;//true
		boolean result8= name !=null;//false
	}
}
