//http://codingbat.com/prob/p137742
package testing;

public class GreaterExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
GreaterExample l = new GreaterExample();
System.out.Println(l.love6(1,6));
}
public boolean love6(int a, int b) {
  return ((a == 6 || b == 6) || ((a+b) == 6) ||((a-b) == 6));
}

}
