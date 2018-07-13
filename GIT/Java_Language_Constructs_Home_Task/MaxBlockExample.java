//http://codingbat.com/prob/p179479
package testing;

public class MaxBlockExample {

public static void main(String[] args) {
// TODO Auto-generated method stub

}
public int maxBlock(String str) {
  if(str.length() == 0 ){
    return 0;
  }
  int highCount = 0;
  int currCount = 1;
  for(int i=1;i<str.length();i++){
    if(str.charAt(i) == str.charAt(i-1)){
      currCount++;
    }else{
      if(currCount > highCount){
        highCount = currCount;
      }
      currCount = 1;
    }
  }
  //return highCount;
  return Math.max(highCount, currCount);
}
}
