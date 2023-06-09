package test.main;

import java.util.Scanner;
/*
 * exception은 모든 exception의 부모 타입이다
 * 
 * -예외종류는 크게 2가지로 분류 할 수 있다
 * 
 * 1.RuntimeException 을 상속 받은 예외
 * try~catch 블럭으로 감싸는 것은 option이다.
 * 
 * 2.RuntimeException을 상속 받지 않은 예외
 * try~catch블럭으로 감싸는 것은 의무이다.
 * 
 * catch(Exception e) 하면 모든 종류의 exception이 처리 가능
 */

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("나눌 수 입력");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는수 입력");
		String inputNum2=scan.nextLine();
	try {
		int num1=Integer.parseInt(inputNum1);//NumberFormatException
		int num2=Integer.parseInt(inputNum2);
		
		int result=num2/num1;//ArithmeticException
		int result2=num2%num1;
		System.out.println(num2+"를"+num1+"으로 나눈 몫 :"+result);
		System.out.println(num2+"를"+num1+"으로 나눈 나머지 :"+result2);
	}catch(Exception e) {
		System.out.println("예외가 발생했습니다");
		System.out.println("예외 메세지"+e.getMessage());
	}finally {
		//여기는 예외가 발생을 하던 안하건 반드시 실향이 보장되는 블럭이다
		//중요한 마무리 작업을 여기서 주로 수행한다.
		System.out.println("중요한 마무리 작업을 진행합니다!");	
	}
	System.out.println("Main 메소드가 정상 종료 됩니다");
  }
}

