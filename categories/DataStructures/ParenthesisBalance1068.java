package DataStructures;

import java.io.DataInputStream;
import java.io.IOException;

public class ParenthesisBalance1068 {

	private static DataInputStream din = new DataInputStream(System.in);

	public static String readLine() throws IOException {
		int c = din.read();
		int openParenthesis = 0;
		boolean close = true;		
		if (c == -1 || c == '\n' || c == 13)
			return null;
		while (c != -1 && c != '\n') {
			if (c == ')') {
				close = true;
				openParenthesis--;
			} else if (c == '(') {
				close = false;
				openParenthesis++;
			}
			c = din.read();
		}
		if (openParenthesis != 0 || !close) {
			return "incorrect";
		}
		return  "correct";
	}

	public static void main(String[] args) {

		try {
			String result;
			while ((result = readLine()) != null) {
				System.out.println(result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}

}
