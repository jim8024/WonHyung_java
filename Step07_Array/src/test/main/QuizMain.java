package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * run 했을때 
		 * cherry apple banana melon 7
		 * 5개의 문자열중 1개가 랜덤하게 출력되게 해 보세요
		 */
		
		//배열 만들기
		//String[] items={~~};
		String [] quiz=new String[5];
		quiz[0]="cherry";
		quiz[1]="apple";
		quiz[2]="banana";
		quiz[3]="melon";
		quiz[4]="7";
		
		//랜덤하게 출력
		Random ran = new Random();
		int ranNum=ran.nextInt(5);
		System.out.println(quiz[ranNum]);	
	}
}
