package test.main;
/*
 * 일정시간 실행의 흐름(thread)을 잡아 놓을 수 있다
 * 컴파일시 발생하는 예외때문에 반드시 try catch
 * 예외 처리를 해야한다(RuntimeException 을 상속 받지 않은 예외)
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작 되었습니다.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main메소드가 종료 되었습니다.");
	}
}
