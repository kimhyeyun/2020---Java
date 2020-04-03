import java.util.Scanner;

public class week3hw_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("수행할 작업을 선택하세요. 1 : 구구단 출력, 2 : 두 정수 x,y에 대한 x를  y로 나눈 나머지 출력.");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("몇 단을 출력하실건가요 :");
			int a=sc.nextInt();
			int i=1;
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			System.out.println(a+"*"+i +"="+ a*i++);
			break;			
			
		case 2:
			int x,y;
			System.out.println("x를 입력하세요 :");
			x=sc.nextInt();
			System.out.println("y를 입력하세요 :");
			y=sc.nextInt();
			System.out.println("x를 y로 나눈 나머지는 "+x%y+" 입니다.");
			break;
			
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
		
	}

}
