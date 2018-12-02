package leetcode;

public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
	     
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i= left; i <= right; i++) {
			
			int x = i;
			boolean add = true;
			while(x > 0) {
				int d = x % 10;
                x /= 10;
							    
				if(d == 0 || i % d != 0 ) {
					add = false;
					break;
				}
			}
			if(add) list.add(i);
		}
		
		return list;
    }
}
