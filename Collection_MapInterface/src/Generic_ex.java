import java.util.ArrayList;
import java.util.List;

class demo{
	public <E>void display(List<E> obj) {
		for(E i:obj) {
			System.out.println(i);
		}
		
	}
}

public class Generic_ex {
	

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        demo d=new demo();
        d.display(l1);
        
        List<String> l2=new ArrayList<>();
        l2.add("Thanu");
        l2.add("Hi");
        l2.add("Hello");
        demo s=new demo();
        d.display(l2);
        
	}

}
