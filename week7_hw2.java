package week7;

import java.util.Scanner;

public class week7_hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] pascal = new int[N][N];
	
		for(int i=0;i<N;i++) {
			pascal[i][0]=1;
			pascal[0][i]=1;
		}
		for(int i=1;i<N;i++) {
			for(int j=1;j<N;j++) {
				pascal[i][j]=pascal[i-1][j]+pascal[i][j-1];
			}
		}
		int i=0,j=N-1;
		while(true) {
			System.out.println(pascal[i][j]);
			i++;
			j--;
			if(i==N)
				break;
		}
		
	}

}
