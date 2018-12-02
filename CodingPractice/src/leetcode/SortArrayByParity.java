package leetcode;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {

		int i = 0, j = A.length - 1;

		while (i <= j) {

			if (A[i] % 2 == 1 && A[j] % 2 == 0) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				i++;
				j--;
			}
			if (A[i] % 2 == 0)
				i++;
			if (A[j] % 2 == 1)
				j--;
		}
		return A;
	}
}
