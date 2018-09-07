import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestProblem4 {

	public static void main(String[] args) {
		System.out.println("Sort by array");
		String[] words = { "amar", "anjal", "pranavi", "anish", "anu", "anj", "enm", "employee" };
		Arrays.sort(words, (x, y) -> Integer.compare(x.length(), y.length()));
		System.out.println(Arrays.deepToString(words));
		System.out.println("Sort by reverse");
		Arrays.sort(words, (x, y) -> Integer.compare(y.length(), x.length()));
		System.out.println(Arrays.deepToString(words));

		System.out.println("Problem 4.4");
		List<String> arrList = Arrays.asList(words);
		arrList.stream().filter((p) -> p.startsWith("e")).forEach((p) -> System.out.println(p));

		List<String> strings = Arrays.asList(words);

		// Shortest to Longest:
		List<String> filtered = strings.stream().filter(string -> string.startsWith("e")).collect(Collectors.toList());
		System.out.println("String that contains e first :" + filtered);

		Collections.sort(strings, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		System.out.println("Shortest to Longest: " + strings);

		// Longest to shortest:
		Collections.sort(strings, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		System.out.println("Longest to shortest: " + strings);

		// sorting based on alphabatical order
		strings.sort(String::compareTo);
		System.out.println("alphabatical : " + strings);
	}

}
