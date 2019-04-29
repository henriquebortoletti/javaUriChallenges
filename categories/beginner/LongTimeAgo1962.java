package beginner;

import java.util.Scanner;

public class LongTimeAgo1962 {

	private final static int YEAR = 2015;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while( x-- > 0) {
			int atual = YEAR -sc.nextInt();
			if(atual>0 )
			System.out.println(atual + " D.C.");
			else 
			System.out.println(-atual+1 + " A.C.");
		}
		sc.close();
	}

}
