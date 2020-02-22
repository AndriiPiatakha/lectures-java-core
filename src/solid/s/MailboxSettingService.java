package solid.s;

public class MailboxSettingService {
	public void changeEmail(User user) {
		if (checkAccess(user)) {
			// Grant option to change
		}
	}
	
	public void setAutoReply(User user) {
		
	}
	
	public void changeSignature(User user) {
		
	}

	public boolean checkAccess(User user) {
		// Verify if the user is valid.
		return false;
	}
}