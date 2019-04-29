package beginner;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//https://www.urionlinejudge.com.br/judge/en/problems/view/1009
public class SalaryWithBonus1009 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		String name = sc.nextLine();
		double fixedSalary = Double.parseDouble(sc.nextLine());
		double productSold = Double.parseDouble(sc.nextLine());
		double result= fixedSalary+productSold*0.15;
		System.out.println("TOTAL = R$ "+  round(result,2));
	}
	
	public static String round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    String result = Double.toString(bd.doubleValue()).replace(",",".");
	    System.out.println(result);
	    if(result.endsWith(".0")) {
	    	result+="0";
	    }
	    return result;
	}
}
