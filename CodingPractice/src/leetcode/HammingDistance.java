package leetcode;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int ans = 0;
		int k = x ^ y;
		for (int i = 0; i < 31; i++) {
			if (((1 << i) & k) != 0)
				ans++;
		}
		return ans;
	}
}
