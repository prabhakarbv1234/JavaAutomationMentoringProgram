//http://codingbat.com/prob/p189576
public int maxSpan(int[] nums) {
  int max = 0;
  for(int i = 0; i< nums.length;i++){
    int j = nums.length-1;
    while(nums[i] != nums[j]){
      j--;
    }
    int s = j-i+1;
    if(s>max){
      max = s;
    }
 
  }return max;
}
