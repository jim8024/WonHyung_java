package frameQuiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
   //필드
   JTextField inputMsg;
   JTextField outputMsg;
   JLabel label;
   JLabel label2;
   String f;
   //생성자
   public MyFrame(String title) {
      super(title);
      //초기 위치와 크기 설정
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      //문자열을 한줄 입력 할수 있는 JTextField 객체 생성
      inputMsg=new JTextField(10);
      JButton sendBtn=new JButton("+");
      JButton sendBtn2=new JButton("-");
      JButton sendBtn3=new JButton("/");
      JButton sendBtn4=new JButton("*");
      outputMsg=new JTextField(10);
      //문자열을 단순히 출력할수 있는 JLable 객체
      label=new JLabel(":");
      label2=new JLabel("");
      
      //MyFrame 을 액션 리스너로 등록을 한다. 
      sendBtn.addActionListener(this);
      sendBtn2.addActionListener(this);
      sendBtn3.addActionListener(this);
      sendBtn4.addActionListener(this);
      
      //함수 형태로 액션 리스너를 등록 할수도 있다. 
     
      
      //프레임에 UI 를 추가한다. 
      add(inputMsg);
      add(sendBtn);
      add(sendBtn2);
      add(sendBtn3);
      add(sendBtn4);
      add(outputMsg);
      add(label);
      add(label2);
      
      //UI 를 모두 배치하고 나중에 호출하는것이 원칙이다 
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new MyFrame("나의 프레임");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
      String msg=inputMsg.getText();
      String msg2=outputMsg.getText();
      double num1 = Double.parseDouble(msg);
      double num2 = Double.parseDouble(msg2);
      String cmd=e.getActionCommand();
      
      if(cmd.equals("+")) {
    	 double result=num1+num2;
    	  f = Double.toString(result); // 정수를 문자형으로 형변환
          label2.setText(f);
      }else if(cmd.equals("-")) {
    	  double result=num1-num2;
    	  f = Double.toString(result); // 정수를 문자형으로 형변환
          label2.setText(f);
      }else if(cmd.equals("/")) {
    	  double result=num1/num2;
    	  f = Double.toString(result); // 정수를 문자형으로 형변환
          label2.setText(f);
      }else if(cmd.equals("*")) {
    	  double result=num1*num2;
    	  f = Double.toString(result); // 정수를 문자형으로 형변환
          label2.setText(f);
      }
    
   }
}









