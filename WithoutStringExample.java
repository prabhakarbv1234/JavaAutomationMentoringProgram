//http://codingbat.com/prob/p192570
package testing;

public class WithoutStringExample {

public static void main(String[] args) {
// TODO Auto-generated method stub1
//String base  = 
System.out.println(withoutString("This is a FISH", "IS"));
}
public static String withoutString(String base, String remove) {
    String new_string = base.replace(remove,"");
    return new_string;
}
}
