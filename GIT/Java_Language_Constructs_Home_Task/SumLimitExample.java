//http://codingbat.com/prob/p118077
public class SumLimitExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
int ii =  10;
String s = Integer.toString(ii);
System.out.println(s);
System.out.println(s.length());
}
public int sumLimit(int a, int b) {
  int c = a+b ;
  String as = Integer.toString(a);
  String cs = Integer.toString(c);
  if (cs.length() > as.length()) {
    return a;
  }else{
    return c;
  }
}
}
