package string;

import java.util.Scanner;

public class FitOrDontFitII1241 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		sc.nextLine();
		int i =0;
		while(i<tests){
			String word = sc.nextLine();
			String [] words = word.split(" ");
			if(words[0].endsWith(words[1])) System.out.println("encaixa");
			else System.out.println("nao encaixa");
			i++;
		}
		
	}

}
