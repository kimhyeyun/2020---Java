import javax.swing.JOptionPane;

interface Grade{
	default void setScore() {}
	default void printScore() {}
}


class MiddeGrade implements Grade{
	static char math;
	static char english;
	static char science;
	public void setScore() {
		math = JOptionPane.showInputDialog
				(null,"���� ����� �Է��ϼ���.","���б�", JOptionPane.INFORMATION_MESSAGE).charAt(0);
		english = JOptionPane.showInputDialog
				(null,"���� ����� �Է��ϼ���.","���б�", JOptionPane.INFORMATION_MESSAGE).charAt(0);
		science = JOptionPane.showInputDialog
				(null,"���� ����� �Է��ϼ���.","���б�", JOptionPane.INFORMATION_MESSAGE).charAt(0);
	}
	public void printScore() {
		System.out.println("MiddleGrade [����="+math+", ����="+english+", ����="+english+"]");
	}

}

class HighGrade implements Grade{
	static int math1,math2,english,physical;
	public void setScore() {
		math1 = Integer.parseInt(JOptionPane.showInputDialog
				(null,"����1 ������ �Է��ϼ���.","����б�", JOptionPane.INFORMATION_MESSAGE));
		math2 = Integer.parseInt(JOptionPane.showInputDialog
				(null,"����2 ������ �Է��ϼ���.","����б�", JOptionPane.INFORMATION_MESSAGE));
		english = Integer.parseInt(JOptionPane.showInputDialog
				(null,"���� ������ �Է��ϼ���.","����б�", JOptionPane.INFORMATION_MESSAGE));
		physical = Integer.parseInt(JOptionPane.showInputDialog
				(null,"���� ������ �Է��ϼ���.","����б�", JOptionPane.INFORMATION_MESSAGE));
	}
	public void printScore() {
		System.out.println("HighGrade [����1="+math1+", ����2="+math2+", ����="+english+", ����="+physical+"]");
	}
}


class UnivGrade implements Grade{
	static String java,english,orientobj,datastr;
	public void setScore() {
		java = JOptionPane.showInputDialog
				(null,"�ڹ� ������ �Է��ϼ���.","��������", JOptionPane.INFORMATION_MESSAGE);
		english = JOptionPane.showInputDialog
				(null,"���� ���� ������ �Է��ϼ���.","��������", JOptionPane.INFORMATION_MESSAGE);
		orientobj = JOptionPane.showInputDialog
				(null,"��ü���� ������ �Է��ϼ���.","��������", JOptionPane.INFORMATION_MESSAGE); 
		datastr = JOptionPane.showInputDialog
				(null,"�ڷᱸ�� ������ �Է��ϼ���.","��������", JOptionPane.INFORMATION_MESSAGE);
	}
	public void printScore() {
		System.out.println("UnivGrade [�ڹ�="+java+", ���п���="+english+", ��ü����="+orientobj+", �ڷᱸ��="+datastr+"]");
	}
}

public class week6_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade grade[] = {new MiddeGrade(), new HighGrade(), new UnivGrade()};
		for (Grade g : grade) {
			g.setScore();
		}
		for (Grade g : grade) {
			g.printScore();
		}
	}

}