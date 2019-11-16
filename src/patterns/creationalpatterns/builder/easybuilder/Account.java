package patterns.creationalpatterns.builder.easybuilder;

public class Account {

	private String userId;
    private String token;

    private Account() {
        // private constructor
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    @Override
   	public String toString() {
   		return "Account [userId=" + userId + ", token=" + token + "]";
   	}
    
    // TODO to fix public class
    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setUserId(String userId) {
            Account.this.userId = userId;

            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;

            return this;
        }

        public Account build() {
            return Account.this;
        }

    }

}