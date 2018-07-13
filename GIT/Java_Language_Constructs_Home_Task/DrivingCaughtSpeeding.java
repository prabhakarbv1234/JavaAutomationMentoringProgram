//:http://codingbat.com/prob/p157733
package testing;

public class DrivingCaughtSpeeding {

public static void main(String[] args) {
// TODO Auto-generated method stub
DrivingCaughtSpeeding c = new DrivingCaughtSpeeding();
System.out.println(c.caughtSpeeding(60, false));
}
public  int caughtSpeeding(int speed, boolean isBirthday) {
if (isBirthday == false) {
if (speed <= 60 ) {
return 0;
}else if (speed > 60 && speed <= 80){
return 1;
}else if (speed >= 81){
return 2;
 
}
}else if (isBirthday == true) {
if (speed <= 65 ) {
return 0;
}else if (speed > 65 && speed <= 85){
return 1;
}else if (speed >= 86){
return 2;
 
}
}
return 5;
}
}
