package exercises.singleton;

public final class SingletonClass {
	
	private static SingletonClass singletonObject;
	private String message = "I'm a singleton";
	
	public static SingletonClass getInstance() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
