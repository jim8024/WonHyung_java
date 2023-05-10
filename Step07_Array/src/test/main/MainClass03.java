package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//1.스트링 타입을 담을 수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조값을  names 라는 객체에 넣기
		String [] names=new String[3];//참조 데이터 타입이라 널 들어가고 나머지는 초기값 0 
		//2.3개의 방에 순서대로 친구의 이름을 담아보세요
		names[0]="kim";
		names[1]="lee";
		names[2]="park";
		//3. 배열에 있는 친구 이름을 하나씩 순서대로 출력
		for(int i=0;i<names.length;i++) {
		System.out.println(names[i]);
		}
	}
}
