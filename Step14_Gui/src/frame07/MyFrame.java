package frame07;

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
	//필드 메소드에서 필요한 값을 담고 있는 것
	
	
	
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
		
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);//프레임에 버튼 추가하기
		
		JButton updateBtn=new JButton("수정");
		 add(updateBtn);
		 
		//전송 삭제 수정 버튼 모두다 하나의 리스너 등록하기
		 sendBtn.addActionListener(this);
		 deleteBtn.addActionListener(this);
		 updateBtn.addActionListener(this);
		 
		 //각각의 버튼에 Action 명령을 내릴 수 있다
		 sendBtn.setActionCommand("send");
		 deleteBtn.setActionCommand("delete");
		 updateBtn.setActionCommand("update");
		 
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
		//눌러진 버튼의 action command 얻어오기
		String cmd=e.getActionCommand();
		/*
		 * java 에서 문자열의 참조값이 같은지 비교할때는 비교연산자를 이용하면 되지만
		 * 문자열의 참조값이 아닌 내용이 같은지 비교할때는 String에 .equals()메소드를 이용해서 비교해야한다
		 * 
		 * 왜냐면 java에서는 문자열을 만드는 방법에 따러소 내용은 같지만 참조값이 다르게 나오는 경오도 있기 때문이다
		 * 따라서 문자열의 내용이 같은지 정확히 비교할때는 반드시 .equals()메소드를 사용해야한다.
		 * 까먹으면 밤셀수도 있음
		 */
		if(cmd.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송");
		}else if(cmd.equals("delste")) {
			JOptionPane.showMessageDialog(this, "삭제");
		}else if(cmd.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정합니다");
		}
		
	}
}









