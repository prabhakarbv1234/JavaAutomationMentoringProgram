--http://codingbat.com/prob/p19226
package testing;

public class blueTicketExample {

public static void main(String[] args) {
// TODO Auto-generated method stub

}
public int blueTicket(int a, int b, int c) {
  if ((a+b)==10 || (b+c) == 10 || (c+a) == 10){
    return 10;  
  }else if((a+b) <= (b+c) || (a+b) <=(a+c)){
    return 5;
  } else{
    return 0 ;
  }
}

}
