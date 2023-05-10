package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuizMain3 {
   public static void main(String[] args) {
      // 로또번호 6개를 출력하는 프로그래밍
	   Scanner scan=new Scanner(System.in);
	   System.out.println("로또 몇개를 구입하시겠습니까? ");
	   int amount=scan.nextInt();
	   for(int i=0;i<amount;i++) {
	   printLotto();
	   System.out.println();//개행
	   }
      //무작위 수를 얻어낼 Random 객체 
      Random ran=new Random();
      //로또번호를 저장할 HashSet 객체 생성해서 참조값을 Set 인터페이스에  type 변수에 담기
      Set<Integer> lottoSet=new HashSet<>();
      //반복문 돌면서 로또번호를 담다가
      while(true) {
         // 1~45 사이의 랜덤한 정수 얻어내기
         int ranNum=ran.nextInt(45)+1;
         //Set 에 담기
         lottoSet.add(ranNum);
         //만일 6개의 숫자를 모두 얻어 냈다면 
         if(lottoSet.size()==6) {
            break; //반복문 탈출!
         }
      }
    
      
      //ArrayList 에 담기
      List<Integer> lottoNums=new ArrayList<>(lottoSet);
      
      //Collections 클래스의 static 메소드를 이용해서 숫자를 오름차순 정렬하기
      Collections.sort(lottoNums);
      //내림차순
     // Collections.sort(lottoNums,Collections.reverseOrder());
      
      for(int i=0; i<lottoNums.size(); i++) {
         int num=lottoNums.get(i);
         System.out.print(num);
         //i가 마지막 인덱스가 아닐때만 , 을 출력한다
         if(i !=lottoNums.size()-1) {
        	  System.out.print(", ");
         }
       
      }
   }
   //로또 번호 한 셋트를 콘솔에 출력하는 메소드
   public static void printLotto() {
	   //무작위 수를 얻어낼 Random 객체 
	      Random ran=new Random();
	      //로또번호를 저장할 HashSet 객체 생성해서 참조값을 Set 인터페이스에  type 변수에 담기
	      Set<Integer> lottoSet=new HashSet<>();
	      //반복문 돌면서 로또번호를 담다가
	      while(true) {
	         // 1~45 사이의 랜덤한 정수 얻어내기
	         int ranNum=ran.nextInt(45)+1;
	         //Set 에 담기
	         lottoSet.add(ranNum);
	         //만일 6개의 숫자를 모두 얻어 냈다면 
	         if(lottoSet.size()==6) {
	            break; //반복문 탈출!
	         }
	      }
	    
	      //ArrayList 에 담기
	      List<Integer> lottoNums=new ArrayList<>(lottoSet);
	      
	      //Collections 클래스의 static 메소드를 이용해서 숫자를 오름차순 정렬하기
	      Collections.sort(lottoNums);
	      //내림차순
	     // Collections.sort(lottoNums,Collections.reverseOrder());
	      
	      for(int i=0; i<lottoNums.size(); i++) {
	         int num=lottoNums.get(i);
	         System.out.print(num);
	         //i가 마지막 인덱스가 아닐때만 , 을 출력한다
	         if(i !=lottoNums.size()-1) {
	        	  System.out.print(", ");
	         }
	       
	      }
	   }
	   
   }













