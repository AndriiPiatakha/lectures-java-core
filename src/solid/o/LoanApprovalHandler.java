package solid.o;

public class LoanApprovalHandler {
	public void approveLoan(PersonalValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}


	
	public void approvePersonalLoan(PersonalLoanValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}
	
	public void approveVehicleLoan(VehicleLoanValidator validator) {
		if (validator.isValid()) {
			// Process the loan.
		}
	}
}

class PersonalLoanValidator {
	public boolean isValid() {
		return false;
		// Validation logic
	}
}

class VehicleLoanValidator {
  public boolean isValid() {
    //Validation logic
	  return false;
  }
}
