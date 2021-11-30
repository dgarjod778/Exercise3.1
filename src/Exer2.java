import java.util.*;

public class Exer2 {

	public static void main(String[] args) {
		String srt;
		char c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una cadena: ");
		srt = sc.nextLine();
		System.out.println("Dime un caracter: ");
		c = sc.next().charAt(0);

		System.out.printf("Entre el primer caracter y el ultimo hay: " + entreCaracteres(srt, c) + "numeros");

	}

	public static int entreCaracteres(String srt, char c) {
		int countF = 0, count1 = 0, count2 = 0, i;
		boolean c1 = false;

		while (c1 == false) {

			if (srt.charAt(count1) == c) {
				c1 = true;
			}
			count1++;
		}

		for (i = 0; i < srt.length(); i++) {
			if ((srt.charAt(i) == c)) {
				count2 = i;
			}

		}
		return count2 - count1;

	}
}
