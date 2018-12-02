package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> unique = new HashSet<>();
		String[] morse = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		for (String word : words) {
			StringBuilder morseCode = new StringBuilder();
			for (char c : word.toCharArray()) {
				morseCode.append(morse[c - 'a']);
			}
			unique.add(morseCode.toString());
		}
		return unique.size();
	}
}
