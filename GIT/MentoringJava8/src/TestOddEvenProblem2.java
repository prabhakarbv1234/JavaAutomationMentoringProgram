import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestOddEvenProblem2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);

		System.out.println("Even Number-->e" + arrList.stream().filter(i -> i % 2 == 0)
				.map(number -> String.valueOf(number)).collect(Collectors.joining("e")));
		System.out.println("Odd Number-->o" + arrList.stream().filter(i -> i % 2 == 1)
				.map(number -> String.valueOf(number)).collect(Collectors.joining("o")));

	}
	}


