package solid.s;

public class EmailSettingService2 {
	public void changeEmail(User user) {
		if (SecurityService.checkAccess(user)) {
			// Grant option to change
		}
	}
}
