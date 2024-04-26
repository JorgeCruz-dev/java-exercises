package exercises.singleton;

public class SingletonDemo {

	public static void main(String args[]) {
		SingletonClass obj1 = SingletonClass.getInstance();
		System.out.println("Object 1 message: " + obj1.getMessage());
		
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println("Object 2 message: " + obj2.getMessage());
		
		SingletonClass obj3 = SingletonClass.getInstance();
		obj3.setMessage("I'm a modified singleton");
		System.out.println("Object 3 message: " + obj3.getMessage());
		
		SingletonClass obj4 = SingletonClass.getInstance();
		System.out.println("Object 4 message: " + obj4.getMessage());
	}
}
