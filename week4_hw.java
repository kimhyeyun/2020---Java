import java.util.Scanner;

public class week4_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str;

		while(true) {
			str=sc.nextLine();
			
			switch(str) {
			case "�ȳ�?":
				System.out.println("�ȳ�");
				break;
			case "�̸��� ����?":
				System.out.println("�������̾�");
				break;
			case "������ ������ �?":
				System.out.println("â���� ��������");
				break;
			case "�ڹٱ���������α׷��� ���� ���?":
				System.out.println("���� ����־�!");
				break;
			case "���� ����� ���?":
				System.out.println("����");
				break;
			case "�� �԰� �ʹ�?":
				System.out.println("����!");
				break;
			case "exit":
				return;
			default:
					System.out.println("�� �װ� �߸𸣰ھ�.");
					break;
					
			}
		}
	}

}
