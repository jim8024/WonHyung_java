package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제할 회원의 정보
		int num=2;
		
		//위의 정보를 이용해서 회우너 정보를 삭제하고 성공하면 삭제 했습니다가 출력되도록 해보세요
		//dao객체 를 생성해서 update() 메소드를 이용해서 수정하고 성공여부 리턴 받기
		MemberDao dao=new MemberDao();
		boolean isSuccess=dao.delete(num);
		if(isSuccess) {
			System.out.println("삭제 했습니다");
		}

	}
	
		
	}

