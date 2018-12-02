package leetcode;

public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {

		int ans = 0;
		int [] stones = new int[256];
		for(char c : S.toCharArray()) stones[(int)c]++;
		for(char c : J.toCharArray()) ans += stones[(int)c]; 
		return ans;
	}
}
