
public class persistantBugger {

	//PERSISTANT BUGGER
	
	public static void main(String[] args) {
		long n = 999;
		long n1;
		
		
		long n2;
		int i = 0;

		do {
			n1 = n;
			n2 = 1;
			do {

				n2 *= (n1 % 10);
				n1 /= 10;

			} while (n1 >= 10);
			n2 *= (n1);

			n = n2;
			i++;

		} while (n >= 10);

		System.out.println(i);
	}

}
