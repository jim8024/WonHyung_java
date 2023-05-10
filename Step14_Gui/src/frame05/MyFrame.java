package frame05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//setBounds(x,y,width,height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//이프레임의 x 버튼을 눌렀을때 프로세스도 같이 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//3을 전달함
		
		setLayout(new FlowLayout());
		
		
		JButton sendBtn=new JButton("전송");   //변수에 담아서 전달
		add(sendBtn);//프레임에 버튼 추가하기

		ActionListener listener1=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼을 눌렀네");
				//클래스명.this하면 밖에 있는 클래스로 생성 할 수 있음.
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다");//프레임의 참조값,띄울 메세지  여기서 this는 ActionListener
				
			}
		};
		sendBtn.addActionListener(listener1);
		
		
		
		
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);//프레임에 버튼 추가하기
		/*
		deleteBtn.addActionListener(new ActionListener() {    //즉석에서 전달
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제 버튼을 눌렀네?");
			}
		});
		*///줄임 표현
		//ActionListener 인터페이스 type의 참조값을 함수 형태로 전달도 가능!
		 deleteBtn.addActionListener((e)->{
			 System.out.println("삭제 버튼을 눌렀네?");
			 //함수 형대의 메소드에서 this는 바깥 클래스로 생성한 객체의 참조값을 가리킬 수 있다.
			 JOptionPane.showMessageDialog(this, "삭제합니다");//이건 this라고 해도 된다
		 });
		 
		 
		 JButton updateBtn=new JButton("수정");
		 add(updateBtn);
		//MyFrame 을 ActionListener 인터페이스type을 만들수는 없을까?>>implement
		 updateBtn.addActionListener(this);
		 
		 
		//프레임을 화면상에 실제 보이게 하기(false 하면 화면에 보이지 않는다)
		setVisible(true);	
	}
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//수정 버튼이 눌렸을때 하고 싶은 동작 작성
		JOptionPane.showMessageDialog(this, "수정합니다");
	}
}
