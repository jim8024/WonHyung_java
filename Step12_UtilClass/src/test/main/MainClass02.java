package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList객체를 생성해서 참조값을 지역변수 nums에 담기
		ArrayList<Integer> nums=new ArrayList<>();
		//Array List 객체에 10,20,30 숫자 3개를 담아보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//확장 for문을 이용해서 저장된 정수를 순서대로 콘솔창에 출력하기
		for(int num : nums)
		    System.out.println(num);
		}
	}


