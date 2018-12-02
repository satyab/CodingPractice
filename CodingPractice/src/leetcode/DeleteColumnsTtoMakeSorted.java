package leetcode;

public class DeleteColumnsTtoMakeSorted {
	public int minDeletionSize(String[] A) {
		if(A.length == 0) return 0;
		int ans = 0;
		int col = A[0].length();
		
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < A.length-1; j++) {
				if(A[j].charAt(i) > A[j+1].charAt(i)) {
					ans++;
					break;
				}
			}
		}
		
		return ans;
	}

}
