import java.util.*;

public class Exer3 {

	public static void main(String[] args) {
		String srt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una cadena y te la dire invertida");
		srt = sc.nextLine();
		
		inverso(srt);
	}

	public static void inverso(String str) {
		int numCaracteres = str.length(), i;

		for (i = str.length(); i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		}

	}

}
