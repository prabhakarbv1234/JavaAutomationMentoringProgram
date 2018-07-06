http://codingbat.com/prob/p17718
package testing;

public class TeaPartyExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println(teaParty(10,20));
}
public int teaParty(int tea, int candy) {
if(tea < 5 || candy < 5){
   return 0;
}else if((tea/2 >= candy) || (candy/2 >= tea)) {
    return 2;
  }else if((tea+candy) >=5 ){
    return 1;
  }else{
    return 4;
  }  
}
}
