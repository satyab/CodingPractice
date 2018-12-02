package leetcode;

public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int start = 0;
			int end = A[i].length - 1;

			while (start <= end) {
				int temp = A[i][start];
				A[i][start] = A[i][end] == 0 ? 1 : 0;
				A[i][end] = temp == 0 ? 1 : 0;

				start++;
				end--;
			}
		}
		return A;
	}
}
