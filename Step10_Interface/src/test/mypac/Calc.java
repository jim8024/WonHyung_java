package test.mypac;

//계산기 인터페이스
@FunctionalInterface//추상메소드를 하나만 만들 수 있도록 강제하는 역할 (()->{})형태로 사용할 수 있도록 보장
public interface Calc {
	//메소드 두개의 실수를 전달 받아서 어떤 연산을 하고 결과 값을 리턴해주는 멧드
	//어떤 연산을 할지 개발자가 알아서 정하기
	public double execute(double num1,double num2);
}
