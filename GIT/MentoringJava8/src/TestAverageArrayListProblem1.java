import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class TestAverageArrayListProblem1 {
	public static void main(String[] args) {		
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);        
        OptionalDouble avg = arrList.stream().mapToDouble(i -> i).average();        
        System.out.println("Average = " + avg.getAsDouble()); 
        OptionalInt max=arrList.stream().mapToInt(i->i).max();
        System.out.println("Max value = " + max.getAsInt());
        OptionalInt min=arrList.stream().mapToInt(i->i).min();
        System.out.println("Min value = " + min.getAsInt());
        int sum=arrList.stream().mapToInt(i->i).sum();
        System.out.println("sum of list = " + sum);
	}

}
