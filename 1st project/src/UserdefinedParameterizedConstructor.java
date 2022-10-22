
public class UserdefinedParameterizedConstructor {

	int id;
	String name;
	float salary;
	UserdefinedParameterizedConstructor(int id,String name,float salary){
		System.out.println(id+""+name+" "+salary);
	}
	void display() {
		System.out.println("user defined constructor");
	}
}
