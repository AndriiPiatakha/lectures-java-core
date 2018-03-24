package patterns.creationalpatterns.builder.easybuilder;

public class Demo {
	
	public static void main(String[] args) {
		Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("habr")
                .build();
		System.out.println(account);
	}

}
