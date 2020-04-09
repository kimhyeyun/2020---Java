import java.util.Scanner;

public class week4_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str;

		while(true) {
			str=sc.nextLine();
			
			switch(str) {
			case "안녕?":
				System.out.println("안녕");
				break;
			case "이름이 뭐니?":
				System.out.println("김혜윤이야");
				break;
			case "오늘의 날씨는 어때?":
				System.out.println("창밖을 직접봐봐");
				break;
			case "자바기반응용프로그래밍 수업 어떠니?":
				System.out.println("무지 재미있어!");
				break;
			case "지금 기분이 어떠니?":
				System.out.println("졸려");
				break;
			case "뭐 먹고 싶니?":
				System.out.println("꼬기!");
				break;
			case "exit":
				return;
			default:
					System.out.println("난 그건 잘모르겠어.");
					break;
					
			}
		}
	}

}
