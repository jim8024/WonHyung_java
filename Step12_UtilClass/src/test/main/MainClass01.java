package test.main;

import java.util.ArrayList;

/*
 * java에서 배열은 크기를 고정할 수 없는 고정 배열이가
 * 
 * 따라서 동적으로 item을 추가하고 삭제하고 하는 작업을 하려면 일반 배열은 사용할 수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String type을 저장할 수 있는 ArrayList 객체를 생성해서 names에 담아보세요
		ArrayList<String> names=new ArrayList<>();//참조 데이터 타입만 사용할 수 있다.
		
		//김구라 해골 원숭이 3개의 스트링 타입을 저장해보세요
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방의 아이템을 불러와서 item이라는 변수에 담아보세요
		String item=names.get(0);
		//1번방의 아이템을 삭제 하려면?
		names.remove(1);
		//0번방에 에어콘을 넣고 싶으면
		names.add(0, "에어콘");
		//저장된 아이템 갯수를 사이즈를 size라는 지역변수에 담아보세요
		int size=names.size();
		//저장된 모든 아이템 삭제
		names.clear();
	}
}
