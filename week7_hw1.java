package week7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class week7_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> m = new LinkedHashMap<>();
		String exit="exit";
		String name;
		int score;
		int i=1;

		while(true) {
			System.out.print("학생"+i+"의 이름을 입력하세요?:");
			name = sc.nextLine();
			
			if(name.equals(exit))
				break;
			
			System.out.print("점수"+i+"을 입력하세요:");
			score = sc.nextInt();
			sc.nextLine();
			m.put(name, score);
			i++;
		}
		
		int j=1;
		for(String key : m.keySet()) {
			String scr="";
			if(m.get(key)>=90)
				scr="A";
			else if(m.get(key)>=80)
				scr="B";
			else if(m.get(key)>=70)
				scr="C";
			else if(m.get(key)>=60)
				scr="F";
			System.out.println(j+"번 학생 "+key+"의 등급은 "+scr+"입니다.");
			j++;
		}
	}

}
