import java.util.Scanner;

public class week4_hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*을 입력하여 출력할 모양을 입력하세요.");
		System.out.println("1: 왼쪽으로 치우친 아래쪽이 큰 삼각형");
		System.out.println("2: 오른쪽으로 치우친 아래쪽이 큰 삼각형");
		System.out.println("3: 우상단에서 좌하단 부분이 비어있는 정사각형");
		System.out.println("이외의 입력인 경우 종료.");
		int num = sc.nextInt();

		while(num>=1 && num<=3) {	
			
			switch(num) {
			case 1:
				System.out.println("출력할 줄의 개수를 입력하세요:");
				int x = sc.nextInt();
				for(int i=1;i<=x;i++) {
					for(int j=0;j<i;j++)
						System.out.print("*");
					System.out.println();
				}
				break;
				
			case 2:
				System.out.println("출력할 줄의 개수를 입력하세요:");
				x = sc.nextInt();
				for(int i=1;i<=x;i++) {
					for(int j=0;j<x-i;j++)
						System.out.print(" ");
					for(int k=0;k<i;k++)
						System.out.print("*");
					System.out.println();
				}
				break;
				
			case 3:
				System.out.println("출력할 줄의 개수를 입력하세요:");
				x = sc.nextInt();
				for(int i=1;i<=x;i++) {
					for(int k=0;k<x-i;k++)
						System.out.print("*");
					System.out.print(" ");
					for(int j=1;j<i;j++)
						System.out.print("*");
					System.out.println();
				}
				
				break;
			}
			
			System.out.println("*을 입력하여 출력할 모양을 입력하세요.");
			System.out.println("1: 왼쪽으로 치우친 아래쪽이 큰 삼각형");
			System.out.println("2: 오른쪽으로 치우친 아래쪽이 큰 삼각형");
			System.out.println("3: 우상단에서 좌하단 부분이 비어있는 정사각형");
			System.out.println("이외의 입력인 경우 종료.");
			num = sc.nextInt();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
