import java.util.Scanner;

public class Square_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		System.out.println("가로/세로 길이를 입력: ");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("정사각형의 넓이: "+x*y);
	}

}
