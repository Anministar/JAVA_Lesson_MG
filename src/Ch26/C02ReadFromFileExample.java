package Ch26;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReadFromFileExample {
	
	public static void main(String[] args) {
		
		
		// 파일 경로 설정
		String filePath = "c:\\iotest\\test.txt";
		
		
		try {
			// FileReader를 사용하여 파일에서 텍스트 읽기
			Reader in = new FileReader(filePath);
			
			
			// 파일에서 한 글자씩 읽어오기
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				
				System.out.print((char) data);
			}
			
			//스트림 닫기
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
