import java.util.Scanner;

public class week3hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		char grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
		
		System.out.println("����� ������" +grade+"�Դϴ�.");
	}
}