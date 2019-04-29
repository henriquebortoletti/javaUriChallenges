package string;

import java.util.Scanner;

public class Led1168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<j;i++) {
			System.out.println(ledsNumber(sc.nextLine()) +" leds");
		}
	}

	private static int ledsNumber(String word) {
		if(word.length()<2) {
			return valueOfChar(word.charAt(0));
		}
		return valueOfChar(word.charAt(0))+ledsNumber(word.substring(1));
	}
	
	private static int valueOfChar(char number) {
		switch(number) {
		case '1':
			return 2;
		case '2':
			return 5;
		case '3':
			return 5;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 3;
		case '8':
			return 7;
		case '9':
			return 6;
		case '0':
			return 6;
			default:
				return 0;
		}
	}
}
