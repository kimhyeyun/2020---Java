import java.util.Scanner;

public class week3hw_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �۾��� �����ϼ���. 1 : ������ ���, 2 : �� ���� x,y�� ���� x��  y�� ���� ������ ���.");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("�� ���� ����Ͻǰǰ��� :");
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
			System.out.println("x�� �Է��ϼ��� :");
			x=sc.nextInt();
			System.out.println("y�� �Է��ϼ��� :");
			y=sc.nextInt();
			System.out.println("x�� y�� ���� �������� "+x%y+" �Դϴ�.");
			break;
			
		default:
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			break;
		}
		
	}

}
