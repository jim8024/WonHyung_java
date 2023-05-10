package test.main;

public class MainClass07 {
	//static 메소드에서 사용하려면 static 필드로 만들어야 한다
	public static int num=999;
	
	//main 메소드는 static 메소드이다.
	public static void main(String[] args) {
		
		int result=MainClass07.num+1;
		
		//main() 메소드와 num 필드는 둘다 MainClass07안에 속해 있으므로(같은 공간)
		//클래스명.은 생략 가능하다
		int result2=num+1;
		//앞에 MainClass07.생략가능
		MainClass07.test();
		test();
	}
	
	public static void test() {
		System.out.println("test()메소드가 호출 되었습니다.");
	}
}
