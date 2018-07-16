//http://codingbat.com/prob/p193817
package Testing;

public class Clumps {
		public static int countClumps(int[] nums) {
		    int count = 0;
		    int i = 0;
		      
		    while(i < nums.length) {
		        int val = nums[i];
		        i++;
		        int length = 1;
		        while(i < nums.length && nums[i] == val) {
		            i++;
		            length++;
		        }
		                                            
		        if(length > 1)
		            count++;
		    }
		                                                          
		    return count;
		}
		
		public static void main(String[] args){
			int[] nums = {2,1,1,2,1,1,2,2,1,1};
			System.out.println(countClumps(nums)) ;
		}
	}
