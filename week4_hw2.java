import java.util.Scanner;

public class week4_hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*�� �Է��Ͽ� ����� ����� �Է��ϼ���.");
		System.out.println("1: �������� ġ��ģ �Ʒ����� ū �ﰢ��");
		System.out.println("2: ���������� ġ��ģ �Ʒ����� ū �ﰢ��");
		System.out.println("3: ���ܿ��� ���ϴ� �κ��� ����ִ� ���簢��");
		System.out.println("�̿��� �Է��� ��� ����.");
		int num = sc.nextInt();

		while(num>=1 && num<=3) {	
			
			switch(num) {
			case 1:
				System.out.println("����� ���� ������ �Է��ϼ���:");
				int x = sc.nextInt();
				for(int i=1;i<=x;i++) {
					for(int j=0;j<i;j++)
						System.out.print("*");
					System.out.println();
				}
				break;
				
			case 2:
				System.out.println("����� ���� ������ �Է��ϼ���:");
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
				System.out.println("����� ���� ������ �Է��ϼ���:");
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
			
			System.out.println("*�� �Է��Ͽ� ����� ����� �Է��ϼ���.");
			System.out.println("1: �������� ġ��ģ �Ʒ����� ū �ﰢ��");
			System.out.println("2: ���������� ġ��ģ �Ʒ����� ū �ﰢ��");
			System.out.println("3: ���ܿ��� ���ϴ� �κ��� ����ִ� ���簢��");
			System.out.println("�̿��� �Է��� ��� ����.");
			num = sc.nextInt();
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
