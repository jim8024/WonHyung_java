package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  현재 존재 하거나 혹은 존재 하지 않는 파일이나 폴더를 제어할 수 있는 file객체를 생성해서
		 *  참조값 f 에 담기
		 */
		File f=new File("C:/acorn202304/myFolder/memo.txt");
		//실제 mem.txt파일이 존재하지 않으면 파일을 만들고
		//존재하면 파일을 삭제하도록 프로그래밍 해보세요
		if(f.exists()) {
			f.delete();
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
