package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 세명의 회원정보(번호,이름,주소)를 HashMap객체에 각각 담아서
		 * 
		 * ArrayList 객체에 누적시켜보세요
		 * 
		 * 반복문을 돌면서 ArrayList 객체에 누적된 회원 정보를 콘솔창에 순서대로 출력해보세요
		 * 
		 * 
		 */
		 HashMap<String, Object> mem1=new HashMap<>();
		 HashMap<String, Object> mem2=new HashMap<>();
		 HashMap<String, Object> mem3=new HashMap<>();
		 
		 mem1.put("num", 1);  
	     mem1.put("name", "kim"); 
	     mem1.put("addr", "paris");
	     
	     mem2.put("num", 2);  
	     mem2.put("name", "lee"); 
	     mem2.put("addr", "london");
	     
	     mem3.put("num", 3);  
	     mem3.put("name", "park"); 
	     mem3.put("addr", "seoul");
	     
	     List<HashMap<String,Object>> memList=new ArrayList<>();
			memList.add(mem1);
			memList.add(mem2);
			memList.add(mem3);
			
		for(int i=0;i<memList.size();i++) {
				Object tmp=memList.get(i);
				System.out.println(tmp);
		}
	     
	    /* ArrayList<Object> memList=new ArrayList<>();
	     memList.add(mem1);
	     memList.add(mem2);
	     memList.add(mem3);
	     
	     for(int i=0;i<memList.size();i++) {
	    	 Object tmp=memList.get(i);
	    	 System.out.println(tmp);
	     }
	     */
	}
}
