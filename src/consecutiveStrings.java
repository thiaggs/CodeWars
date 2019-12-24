
public class consecutiveStrings {

	public static void main(String[] args) {
		String[] strarr = new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
		int k = 1;
		
		if( (strarr.length == 0) || (k > strarr.length) || (k <= 0) ) {
			System.out.println("");
		}
		String str = "";
		String aux;
		
		for (int i = 0; i < strarr.length - (k-1); i++) {
			aux = "";
			
			for (int j = 0; j < k; j++) {
				aux += strarr[i+j]; 
			}
			if(aux.length() > str.length()) {
				str = aux;
			}
			
		}
		
		System.out.println(str);
	}

}
