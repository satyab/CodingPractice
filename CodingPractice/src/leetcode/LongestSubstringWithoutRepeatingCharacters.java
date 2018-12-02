package leetcode;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {

		int ans = 0;
		int[] map = new int[255];
		Arrays.fill(map, -1);

		int i = 0;
		int j = 0;
		boolean calc = false;
		for (char c : s.toCharArray()) {
			if (map[(int) c] != -1 && map[(int)c] >= i) {
				ans = Math.max(ans, j - i);
				i = map[(int) c] + 1;
				calc = true;
			} else {
				calc = false;
			}
			map[(int) c] = j;
			j++;
		}

		return !calc ? Math.max(ans, j - i) : ans;
	} 
	
	/*
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int[] index = new int[256];

		for (int i = 0, j = 0; j < s.length(); j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}*/
}


	