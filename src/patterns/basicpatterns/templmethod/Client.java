package patterns.basicpatterns.templmethod;

public class Client {

	public static void main(String[] args) {

		CrossCompiler iphone = new IPhoneCompiler();
		iphone.crossCompile();
		CrossCompiler android = new AndroidCompiler();
		android.crossCompile();

	}

}