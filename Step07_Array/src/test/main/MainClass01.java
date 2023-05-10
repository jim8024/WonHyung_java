package test.main;
/*
 * java에서 배열도 객체이다
 * 즉 배열은 참조데이터 타입이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열 객체를 생성해서 참조값에 담기
		int[] nums= {10,20,30,40,50};       //int배열타입,null은 참조데이터(키)가 담기는 빈공간
		//double type 5개를 저장하고 있는 배열
		double[] num2= {10.1,10.2,10.3,10.4,10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true,false,false,true,true};
		//String type(참조 데이터 type)5개를 저장하고 있는 배열
		String[] names= {"김구라","해골","원숭이","주댕이","덩어리"};
		//총 객체 9개가 만들어짐
		//배열 객체는 .clone() 이라는 메소드와 .lengh라는 필드가 있다.
		int[] result1=nums.clone();
		int result2=nums.length;
		//배열은 순서가 있는 데이터이다. 특정 index의 item을 참조 하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		//clone에대해 생각해보자
	}
}
