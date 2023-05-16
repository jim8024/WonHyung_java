package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//수정할 회원정보
		int num=1;
		String name="김구라";
		String addr="독산동";
		
		//위의 정보를 이용해서 1번회원의 정보를 수정하고 성공하면 수정했습니다출력
		//수정할 회원의 정보를 dto객체에 담고
//	MemberDto dto=new MemberDto();
//		dto.setName(name);
//		dto.setAddr(addr);
//		dto.setNum(num);
		
		MemberDto dto=new MemberDto(num,name,addr);
		
		//dao객체 를 생성해서 update() 메소드를 이용해서 수정하고 성공여부 리턴 받기
		MemberDao dao=new MemberDao();
		boolean isSuccess=dao.update(dto);
		if(isSuccess) {
			System.out.println("수정했습니다");
		}
	}
}
