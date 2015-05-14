import java.util.Scanner;


public class NineDigitMagic {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		int sum = Integer.parseInt(str.nextLine());
		int diff = Integer.parseInt(str.nextLine());
		str.close();
		int count = 0;

		for (int i = 111; i <= 777; i++) {
			for (int i2 = i; i2 <= 777; i2++) {
				for (int i3 = i2; i3 <= 777; i3++) {
					int currDiff1 = i2 - i;
					int currDiff2 = i3 - i2;
					int currSum = 0;
					currSum += (i / 100) + ((i % 100) / 10) + (i % 10);
					currSum += (i2 / 100) + ((i2 % 100) / 10) + (i2 % 10);
					currSum += (i3 / 100) + ((i3 % 100) / 10) + (i3 % 10);
					if (currDiff1 == diff &&
							currDiff2 == diff &&
							currSum == sum) {
						String currNum = "" + i + i2 + i3;
						boolean isValid = !currNum.contains("8") &&
								!currNum.contains("9") &&
								!currNum.contains("0");
						if (isValid) {
							System.out.println(currNum);
							count++;
						}
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("No");
		}
	}
}
