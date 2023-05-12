package Frame01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//border layout으로 설정
		setLayout(new BorderLayout());
		//UI를 감쌀 패널
		JPanel p1=new JPanel();
		
		JTextField inputText=new JTextField(20);
		JButton saveBtn=new JButton("저장");
		
		//페널에 유아이 추가
		p1.add(inputText);
		p1.add(saveBtn);
		//페널을 프레임의 북쪽에 위치
		add(p1,BorderLayout.NORTH);
		//페널의 배경색
		p1.setBackground(Color.yellow);
		/*
		 * 읽어오기 버튼을 누르면 daiary.text 에 있는 모든 문자열을 읽어와서 
		 * JTextArea에 풀려해 보세요
		 * 
		 * -hint
		 * FileReader객체를 이용하면 문자열을 읽어낼 수 있습니다.
		 */
		JTextArea ta=new JTextArea();
		add(ta, BorderLayout.CENTER);
		
		
		JButton readBtn=new JButton("읽어오기");
		p1.add(readBtn);
		
		setVisible(true);
		
		File f=new File("C:\\acorn202304\\myFolder\\diary.txt");
		
		readBtn.addActionListener((e2)->{
			//try블럭 안에서 사용할 변수를 미리 만들어 놓는다.
			FileReader fr=null;
			BufferedReader br=new BufferedReader(fr);
			try {
				//참조값은 try블럭 안에 new 해서 넣어준다
				fr=new FileReader(f);
				br=new BufferedReader(fr);
				while(true){
					//문자열을 한줄씩 읽어낸다
					String line=br.readLine();
					//만일 더이상 읽을 문자열이 없다면 
					if(line==null)break;//반복문 탈출
					//읽어낸 문자열을 JTextArea에 출력하기
					ta.append(line);//개행 기호는 제외된상태로 읽어내기 때문에 
					ta.append("\r\n");//개행기호를 따로 추가해 준다.
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				//사용했던 스트림은 닫아주는 것이 좋다(열렸던 순서의 역순으로..)
				try {
					//close()를 호출 할떄도 null에 주의해서 호출해야한다.
					if(br!=null)br.close();    //여기서 null point exception 이 발생하면 fr.close() 가 호출 안될 가능성이 있다
					if(fr!=null)fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		//버튼에 리스너 등록
		saveBtn.addActionListener((e2)->{
			//입력한 문자열 읽어오기
			String msg=inputText.getText();//바깥영역에 정의된 지역변수 참조 가능
			//file 객체
			try{
				if(!f.exists()) {
					f.createNewFile();
				}
				//파일에 출력할 문자열 객체
				FileWriter fw =new FileWriter(f,true);
				fw.write(msg);
				fw.write("\r\n");
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, "저장했습니다");
			}catch(Exception e) {
				e.printStackTrace();
			}	
		});
		
		
	}
	

	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

}
