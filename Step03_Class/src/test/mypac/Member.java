package test.mypac;
/*
 * Member 객체 하나에 회원 번호,이름,주소를 담기 위해 Member 객체를 설계 하려고 한다.
 */
public class Member {
	
	public int num;
	public String name;
	public String addr;
	
	
	//메소드 추가
	public void showInfo() {
		System.out.println("번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
	}
}
