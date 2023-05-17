package test.main;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.print("출력할 구구단 단수 입력 :");
	int inputNum=scan.nextInt();
		for(int i=1;i<10;i++) {
			int result=i*inputNum;
			System.err.println(inputNum+" x "+i+" = "+result);
		}
	}
}

