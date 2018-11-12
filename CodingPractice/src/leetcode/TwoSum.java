package leetcode;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        
		int[] ans = new int[2];

		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j <  nums.length; j++) {
				if(nums[i] + nums[j] == target) return new int[] {i,j};
			}
        }
		
		return ans;
    }
	

	
	public static void main(String [] args) {
		
		int [] nums = new int[] {3,2,4};
		int target = 6;
		
		int[] ans = new TwoSum().twoSum(nums, target);
		
		System.out.println(ans[0]+ " " + ans[1]);
		
	}
}
