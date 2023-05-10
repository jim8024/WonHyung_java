package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * run 했을때
		 * 5개의 문자열 중에서 3개가 랜덤하게 출력되게 해 보세요
		 */
		String[] items= {"cherry","apple","banana","melon","7"};
		Random ran=new Random();
		
		int[] nums =new int[3];//사용할 위치에 따라 선언 위치 다름(for문 밖에서 사용하니까 밖에 선언)
		
		for(int i=0;i<3;i++) {
			int ranNum=ran.nextInt(5);
			System.out.print(items[ranNum]);
			nums[i]=ranNum;
			if(i<2) {
				System.out.print(" | ");
			}
		}
		System.out.println("");
		
		if(nums[0]==nums[1] && nums[1]==nums[2]) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
	}
}
