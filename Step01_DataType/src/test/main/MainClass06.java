package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//지역변수는 값을 넣지 않고 선언만 하면 만들어지지 않는다.
		int num1;
		String name1;
		//만들어지지 않았기 때무에 참조 불가,name1도 참조 불가
		//int result=1-+num1;
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}