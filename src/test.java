
public class test {

	public static void main(String[] args) {

		String srt = "jjjjjja";
		boolean c1=false;
		int i, count = 0;

		while (c1 == false) {

			if (srt.charAt(count) == 'a') {
				c1 = true;
			}
			count++;
		}
		
		System.out.println(count);

	}
}
