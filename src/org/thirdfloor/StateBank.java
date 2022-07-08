package org.thirdfloor;

public abstract class StateBank {
	public abstract void currentAccount();
	public abstract void savingsAccount();
	public abstract void loanAccount();
	public void jewelLoan(){
		System.out.println("Jewel loan is 15%");
	}
}
