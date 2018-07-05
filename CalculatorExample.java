package testing;

public class CalculatorExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i = Integer.parseInt(args[0]);
int j = Integer.parseInt(args[1]);
CalculatorExample c = new CalculatorExample();
System.out.println(c.calc(i, j, "add"));
System.out.println(c.calc(i, j, "sub"));
System.out.println(c.calc(i, j, "mul"));
System.out.println(c.calc(i, j, "div"));
System.out.println(c.calc(i, j, "per"));
System.out.println(c.calc(i, j, "rem"));
}
public String calc(int num1,int num2,String Op){
switch(Op){
case "add":
return "Sum of i and j = " +(num1 + num2);
 
case "sub":
return "Diff of i and j = " +(num1 - num2);
 
case "mul":
return "Mul of i and j = " +(num1 * num2);
case "div":
return "div of i and j = " +(num1 / num2);
case "per":
return "percent of i and j = " +(num1 / num2)*100 +"%";
 
default:  
return  "rem of i and j = " +(num1 % num2);
}
}
}
