package string;

import java.util.Scanner;

public class HowEasy1243 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()){
			System.out.println(validateLine(sc.nextLine()));
		}
	}
	
	public static int validateLine(String line){
		 /* no9 . wor7ds he8re. hj..*/
		/*\\s+|,\\s*|\\.\\s*|*/
		
		String [] words = line.split("\\s+");
		int sumWords = 0;
		int sumLength = 0;
		for(String word: words){
			word = word.endsWith(".") ? word.substring(0, word.length()-1):word;
			if(!word.contains(".") && !word.isEmpty() && !word.matches("\\w*\\d+\\w*") ){
				sumWords ++;
				sumLength += word.length();
			}
		}
		sumWords = (sumWords == 0 ? 1:sumWords);
		return (sumLength/sumWords <= 3 ? 250 : (sumLength/sumWords <= 5 ? 500: 1000));
	}
}
