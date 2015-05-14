import java.util.Arrays;
import java.util.Scanner;


public class Sunglasses {
	
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		int size = Integer.parseInt(str.nextLine());
		str.close();
		
		char[] frame = new char[size * 2];
		char[] empty = new char[size];
		char[] bridge = new char[size];
		char[] glass = new char[(size * 2)];
		Arrays.fill(frame, '*');
		Arrays.fill(empty, ' ');
		Arrays.fill(bridge, '|');
		Arrays.fill(glass, '/');
		glass[0] = '*';
		glass[glass.length-1] = '*';
		String frameS = new String(frame);
		String emptyS = new String(empty);
		String bridgeS = new String(bridge);
		String glassS = new String(glass);
		
		System.out.println(frameS + emptyS + frameS);
		for (int i = 0; i < size / 2 - 1; i++) {
			System.out.println(glassS + emptyS + glassS);
		}
		System.out.println(glassS + bridgeS + glassS);
		for (int i = 0; i < size / 2 - 1; i++) {
			System.out.println(glassS + emptyS + glassS);
		}
		System.out.println(frameS + emptyS + frameS);
	}
}
