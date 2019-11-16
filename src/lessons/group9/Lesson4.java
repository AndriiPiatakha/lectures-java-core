package lessons.group9;

public class Lesson4 {

	public static void main(String[] args) {
		Class clazz = User.class;
		
		Parent p = new Parent();
		User u = new User();
		
		if (p instanceof User) {
			u = (User)p;
		}
		
		
		
	}
	
}


class Calculator extends Parent {
	
	public void sum() {
		
	}
}

class Parent {
	public Parent() {}
	public Parent(int someParentField) {
	}
}

class User extends Parent {
	
	private Calculator calculator;
	
	static {
		
	}
	
	public User() {
	}

	public User(int i) {
		
	}
	
	class Account {
		
	}
	
	static class Account2 {
		
	}
	
	public void sum() {
		calculator.sum();
	}

	@Override
	public String toString() {
		return "User [calculator=" + calculator + "]";
	}
	
}



