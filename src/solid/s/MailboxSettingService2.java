package solid.s;

public class MailboxSettingService2 {
	
	private SecurityService ss = new SecurityService();
	
	public void changeEmail(User user) {
		if (ss.checkAccess(user)) {
			// Grant option to change
		}
	}
}
