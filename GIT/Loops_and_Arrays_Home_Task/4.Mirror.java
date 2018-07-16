package Testing;

public class Mirror {
	public static int maxMirror(int[] nums) {
	    int max = 0;
	    
	    for(int start = 0; start < nums.length; start++) {
	        for(int begin = nums.length - 1; begin >= 0; begin--) {
	            int size = 0;
	            int i = start;
	            int j = begin;
	                                  
	            while(i < nums.length && j >= 0 && nums[i] == nums[j]) {
	                size++;
	                i++;
	                j--;
	            }
	                                                                              
	            max = Math.max(max, size);
	        }
	    }
	                                                                                            
	    return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 8, 9, 3, 2, 1};
		System.out.println(maxMirror(nums)) ;

	}

}
