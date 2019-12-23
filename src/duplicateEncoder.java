import java.util.Map;
import java.util.HashMap;

public class duplicateEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "prespecialized";
		String newWord = "";

		Map<Character, Integer> mapaChar = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			int qnt = 0;
			if (mapaChar.containsKey(word.charAt(i))) {
				continue;
			}
			for (int j = 0; j < word.length(); j++) {

				if (word.charAt(j) == word.charAt(i)) {
					qnt++;
				}
			}

			mapaChar.put(word.charAt(i), qnt);
		}

		for (int i = 0; i < word.length(); i++) {
			if (mapaChar.get(word.charAt(i)) > 1) {
				newWord += ')';
			} else {
				newWord += '(';
			}
		}
		System.out.println(newWord);
	}

}
