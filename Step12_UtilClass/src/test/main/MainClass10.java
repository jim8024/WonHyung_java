package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		names.add("주댕이");
		names.add("덩어리");
		//반복자 객체 얻어내기
		Iterator<String> it=names.iterator();
		
		while(it.hasNext()) {
			String item=it.next();
			System.out.println(item);
		}
		
		
		System.out.println("-------");
		
		
		names.forEach((item)->{
			System.out.println(item);
		});
		
		//특정 아이템 존재여부 알아내내기
		boolean isContain=names.contains("김구라");
		//저장된 아이템 갯수
		int size=names.size();
;		//특정 아이템 삭제
		names.remove("해골");
		//모든 아이템 삭제
		names.clear();
	}
}
