import java.util.ArrayList;
import java.util.Scanner;


public class HalfSum {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		int n = Integer.parseInt(str.nextLine());

		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			first.add(Integer.parseInt(str.nextLine()));
		}
		for (int i = 0; i < n; i++) {
			second.add(Integer.parseInt(str.nextLine()));
		}
		str.close();
		
		int firstSum = 0;
		int secondSum = 0;
		for (Integer i : first) {
			firstSum += i;
		}
		for (Integer i : second) {
			secondSum += i;
		}
		
		if (firstSum == secondSum) {
			System.out.println("Yes, sum=" + firstSum);
		} else {
			int diff = Math.abs(firstSum - secondSum);
			System.out.println("No, diff=" + diff);
		}
	}
}
