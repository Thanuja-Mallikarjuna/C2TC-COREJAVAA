import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,4,7);
	  Stream<Integer>str=	list.stream();
	  str.forEach(System.out.println);

	}

}
