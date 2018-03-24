package solid.s;

public class EmailSettingService2 {
	
	private SecurityService ss = new SecurityService();
	
	public void changeEmail(User user) {
		if (ss.checkAccess(user)) {
			// Grant option to change
		}
	}
}
