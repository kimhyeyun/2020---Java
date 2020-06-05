package week12;

import java.io.IOException;

public class hw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int b,len = 0;
		int ba[]=new int[100];
		
		System.out.println("---입력 스트림---");
		while((b=System.in.read())!=13){
			System.out.printf("문자 : %c, 십진수 : (%d)\n",(char)b, b);
			ba[len++] = b;
		}
		
		System.out.println("\n\n--- 출력 스트림 ---");
		for(int i=0;i<len;i++)
			System.out.write(ba[i]);
		
		System.out.flush();
	}

}
