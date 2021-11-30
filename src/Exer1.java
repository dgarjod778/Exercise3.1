import java.util.*;

public class Exer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String srt;
		System.out.println("Dime una cadena y y te dire cuantas vocales tiene.");
		srt = sc.nextLine();

		System.out.println("El numero de vocales de la cadena introducida es:" + vocales(srt));

	}

	public static int vocales(String srt) {
		int cont = 0, i;

		for (i = 0; i < srt.length(); i++) {
			if ((srt.charAt(i) == 'a') || (srt.charAt(i) == 'e') || (srt.charAt(i) == 'i') || (srt.charAt(i) == 'o')
					|| (srt.charAt(i) == 'u')) {
				cont++;
			}
		}

		return cont;

	}

}
