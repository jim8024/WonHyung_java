package test.main;
/*
 * 4.논리 연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
		//or 연산
		/*
		 * 또는 이라고 읽으면 된다
		 * 
		 * 어느하나만 true면 결과는 true
		 * 모두가 false일때만 결과는 false
		 */
		boolean result1=false||false;//이것만 false
		boolean result2=false||true;
		boolean result3=true||false;
		boolean result4=true||true;
		
		//and 연산
		/*
		 * 그리고 라고 읽으면 된다
		 * 
		 * 모두다 true일때만  결과는 true
		 * 허느하나가  false일때 결과는 false
		 */
		boolean result5=false&&false;
		boolean result6=false&&true;
		boolean result7=true&&false;
		boolean result8=true&&true;//이것만 true
		
		/*
		 * not 연산
		 * ~가 아니면 이라고 읽는다.
		 * 
		 * boolean 값을 반전 시킨다
		 */
		boolean result9=!true;//false
		boolean result10=!false;//true
	}
}



