package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//생성자 정의하기(하나라도 정의 하면 default생성자는 사라진다)
	public Member(int num,String name,String addr) {   //매개변수
		this.num=num;//필드에 저장
		this.name=name;
		this.addr=addr;
	}
	//default 생성자
	public Member() {}
	
	//메소드
	public void printInfo() {
		System.out.println("번호"+num+" 이름"+name+" 주소"+addr);
	}
}
