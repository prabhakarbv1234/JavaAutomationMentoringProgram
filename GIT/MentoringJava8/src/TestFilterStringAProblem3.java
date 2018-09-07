import java.util.Arrays;
import java.util.List;

public class TestFilterStringAProblem3 {

	public static void main(String[] args) {		
        List<String> arrList = Arrays.asList("amar", "anjal", "pranavi", "anish","efg", "anu","", "anj");
        arrList.stream()
        .filter((p) -> p.startsWith("a"))  
        .filter(p -> p.length()==3)       
        .forEach((p) -> System.out.println(p));
       
	}

}
