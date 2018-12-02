package leetcode;

public class ToLowerCase {
	public String toLowerCase(String str) {
		char[] lower = new char[str.length()];

		int i = 0;
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				lower[i] = (char) ((int) c + 32);
			} else {
				lower[i] = c;
			}
			i++;
		}
		return new String(lower);
	}
}
