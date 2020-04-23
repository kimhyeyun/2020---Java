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
				(null,"수학 등급을 입력하세요.","중학교", JOptionPane.INFORMATION_MESSAGE).charAt(0);
		english = JOptionPane.showInputDialog
				(null,"영어 등급을 입력하세요.","중학교", JOptionPane.INFORMATION_MESSAGE).charAt(0);
		science = JOptionPane.showInputDialog
				(null,"과학 등급을 입력하세요.","중학교", JOptionPane.INFORMATION_MESSAGE).charAt(0);
	}
	public void printScore() {
		System.out.println("MiddleGrade [수학="+math+", 영어="+english+", 과학="+english+"]");
	}

}

class HighGrade implements Grade{
	static int math1,math2,english,physical;
	public void setScore() {
		math1 = Integer.parseInt(JOptionPane.showInputDialog
				(null,"수학1 점수를 입력하세요.","고등학교", JOptionPane.INFORMATION_MESSAGE));
		math2 = Integer.parseInt(JOptionPane.showInputDialog
				(null,"수학2 점수를 입력하세요.","고등학교", JOptionPane.INFORMATION_MESSAGE));
		english = Integer.parseInt(JOptionPane.showInputDialog
				(null,"영어 점수를 입력하세요.","고등학교", JOptionPane.INFORMATION_MESSAGE));
		physical = Integer.parseInt(JOptionPane.showInputDialog
				(null,"물리 점수를 입력하세요.","고등학교", JOptionPane.INFORMATION_MESSAGE));
	}
	public void printScore() {
		System.out.println("HighGrade [수학1="+math1+", 수학2="+math2+", 영어="+english+", 물리="+physical+"]");
	}
}


class UnivGrade implements Grade{
	static String java,english,orientobj,datastr;
	public void setScore() {
		java = JOptionPane.showInputDialog
				(null,"자바 학점을 입력하세요.","대학점수", JOptionPane.INFORMATION_MESSAGE);
		english = JOptionPane.showInputDialog
				(null,"대학 영어 학점을 입력하세요.","대학점수", JOptionPane.INFORMATION_MESSAGE);
		orientobj = JOptionPane.showInputDialog
				(null,"객체지향 학점을 입력하세요.","대학점수", JOptionPane.INFORMATION_MESSAGE); 
		datastr = JOptionPane.showInputDialog
				(null,"자료구조 학점을 입력하세요.","대학점수", JOptionPane.INFORMATION_MESSAGE);
	}
	public void printScore() {
		System.out.println("UnivGrade [자바="+java+", 대학영어="+english+", 객체지향="+orientobj+", 자료구조="+datastr+"]");
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