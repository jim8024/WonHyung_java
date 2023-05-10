package test.main;

public class MainClass04 {
	//static 메소드 안에서 사용하려면 static 예약어 필요!
	public static class Gura{
		public void say() {
			System.out.println("안녕 나는 구라야!");
		}
	}
	//static 메소드(스테틱 영역에 main class04에 올라가기 때문에
	//static 자원들만 사용 가능하다.
	public static void main(String[] args) {
		Gura g =new Gura();
		g.say();
		
		//메소드 안에 클래스 정의 가능
		//메소드 안에 정의한 클래스를 지역 내부 클래스 라고 한다.(local inner class)
		//메소드 내부에서만 사용 할 수 있다.
		class Cat{
			public void say() {
				System.out.println("야옹");
			}
		}
		Cat c =new Cat();
		c.say();
	}
}
