//http://codingbat.com/prob/p158767
public class Balance{
	public static boolean canBalance(int[] nums) {
		int first = 0;
		int second = 0;
		  
		for(int i = 0; i < nums.length; i++)
			second += nums[i];
				  
		for(int i = 0; i <= nums.length - 2; i++) {
			first += nums[i];
			second -= nums[i];
								
			if(first == second)
				return true;
		}
											  
		return false;
	}
	public static void main(String[] args){
		int[] nums = {2,1,1,2,1};
		System.out.println(canBalance(nums)) ;
	}
}	