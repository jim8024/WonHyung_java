package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//MyUtil class의 send()메소드 호출해 보기
 		MyUtil.send();
		//MyUtil class의 version 필드 참조해 보기
		String v=MyUtil.version;
		System.out.println("오잉?");
		//1970년 1월1일자정으로 부터 현재까지 경과 시간을 mili sec 단위로 얻어내기
		long time=System.currentTimeMillis();
		System.out.println(time);
	}
}
