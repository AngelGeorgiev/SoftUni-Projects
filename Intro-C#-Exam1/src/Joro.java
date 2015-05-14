import java.util.Scanner;


public class Joro {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		String leap = str.nextLine();
		int holidays = Integer.parseInt(str.nextLine());
		int hometown = Integer.parseInt(str.nextLine());
		str.close();
		
		float plays = 0;
		if (leap.equals("t")) {
			plays += 3;
		}
		plays += holidays * 0.5f;
		plays += hometown;
		plays += (52 - hometown) * 2/3;
		
		int playsInt = (int) plays;
		System.out.println(playsInt);
	}
}
