	package mathematics;
	
	import java.util.Scanner;
	
	public class FitOrDontFit1240 {
		
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			int end = sc.nextInt();
			for(int i =0;i<end;i++) {
				System.out.println(fitOrNot(sc.nextInt(),sc.nextInt()));
			}
			
		}
		
		
		private static String fitOrNot(int a, int b) {
			
			if(b == 0) return "encaixa";
			if((a%10 != b%10) || (b>a))return "nao encaixa";
			return fitOrNot(a/10,b/10);
		}
	
	}
