package string;

import java.util.Scanner;

public class ContractRevision1120 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word[] = sc.nextLine().split(" ");

		while (!word[0].equals("0") || !word[1].equals("0")) {
			System.out.println(finalNumber(word[0].charAt(0), word[1]));
			word = sc.nextLine().split(" ");
		}
	}

	private static String finalNumber(char failNumber, String agreedNumber) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < agreedNumber.length(); i++) {
			char actualChar = agreedNumber.charAt(i);
			if (actualChar != failNumber && (sb.length() > 0 || actualChar != '0'))
				sb.append(actualChar);
		}
		if (sb.length() <= 0)
			sb.append("0");
		return sb.toString();
	}

}
