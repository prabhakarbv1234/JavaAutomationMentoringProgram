--http://codingbat.com/prob/p153748
package testing;

public class ShareDigitExample {

public static void main(String[] args) {
// TODO Auto-generated method stub

}
public boolean shareDigit(int a, int b) {
  int ar = a%10;
  int aq = a/10;
  int br = b%10;
  int bq = b/10;
  
  return (ar==br || ar==bq || aq == br || aq == bq) ;  
}
}
