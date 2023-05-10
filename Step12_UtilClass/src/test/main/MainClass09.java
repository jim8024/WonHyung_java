package test.main;
/*
 *while문을 활용해서 원하는 횟수만큼 반복하기
 *
 *-반복횟수가 정확히 정해져 있음 for문
 *
 *-반복횟수가 정확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while문으로 도는게 좋다
 */
public class MainClass09 {
	public static void main(String[] args) {
		//카운트 셀 변수를 미리 만들어서 0으로 초기화
		int count=0;
		///무한 루프 돌다가
		while(true) {
			System.out.println("안녕");
			count++;
			//특정 조건 하에서 무한 루프 빠져나오기
			if(count==5) {
				break;
			}
		}
		
		System.out.println("------");
		
		int i=0;
		
		while(i<5) {
			System.out.println("안녕!!");
			i++;
		}
	}
}
