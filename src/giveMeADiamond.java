
public class giveMeADiamond {

	public static void main(String[] args) {
		int n = 257;
		int spaces = n/2;
		String str = "";

		if ((n < 0) || (n % 2 == 0)) {
			System.out.println(0); // null
		}
		for (int i = 1; i <= n; i += 2) {
			for (int k = 0; k < spaces; k++) {
				str += ' ';
			}
			spaces--;

			for (int j = 1; j <= i; j++) {
				str += '*';
			}
			str += "\n";

		}
		spaces++;

		for (int i = n - 2; i >= 1; i -= 2) {
			spaces++;
			for (int k = 0; k < spaces; k++) {
				str += ' ';
			}
			for (int j = 1; j <= i; j++) {
				str += '*';
			}
			str += "\n";
		}

		System.out.println(str);

	}

}
