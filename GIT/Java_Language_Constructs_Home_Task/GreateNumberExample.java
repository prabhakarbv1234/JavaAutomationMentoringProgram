--http://codingbat.com/prob/p154188
package testing;

public class GreaterNumberExample {

public static void main(String[] args) {
// TODO Auto-generated method stub

}
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk){
    return c>b;
    
  }else {
    return b > a && c > b;
  } 
}
}
