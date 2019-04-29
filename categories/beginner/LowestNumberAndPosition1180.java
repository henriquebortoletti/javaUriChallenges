package beginner;

import java.util.Scanner;

public class LowestNumberAndPosition1180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int pos=0;
		int lowest = sc.nextInt();
		for(int i =1;i<j;i++) {
			int actual = sc.nextInt();
			if(lowest>=actual) {
				lowest = actual;
				pos = i;
			}
		}
		System.out.println("Menor valor: "+lowest);
		System.out.println("Posicao: "+pos);

	}

}
