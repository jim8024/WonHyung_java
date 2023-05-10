package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		
		//키보드로 부터 입력 받을 수 있는 기능을 가진 객체 생성
		Scanner scan=new Scanner(System.in);
		//개행 기호를 출력하지 않고 콘솔창에 문자열 출력하기
		System.out.print("문자열 입력:");
		//문자열을 입력받고
		String str=scan.nextLine(); //이 시점에서 bolcking(키보드로 부터 입력 받으려고 대기)
		//입력받은 문자열 콘솔에 출력해보기
		System.out.println(str);
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
