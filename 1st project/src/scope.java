
public class scope {

	public static void main(String[] args) {
		int outer=3;
	
	{
    int inner=40;
    System.out.println(inner);
    System.out.println(outer);
    
	}
	int inner=3;
	System.out.println(inner);
	
	}
}
