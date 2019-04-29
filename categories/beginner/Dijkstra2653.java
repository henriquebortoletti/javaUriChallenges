package beginner;

import java.util.HashSet;
import java.util.Scanner;

public class Dijkstra2653 {

	public static void main(String args[]) {
		HashSet<String> jewelry  = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()) {
			jewelry.add(sc.nextLine());
		}
		System.out.println(jewelry.size());
		
	}
}
