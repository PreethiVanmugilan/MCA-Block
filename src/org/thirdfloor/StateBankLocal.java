package org.thirdfloor;

public class StateBankLocal extends StateBank{

	@Override
	public void currentAccount() {
		System.out.println("current account rate is 10%");
		
	}

	@Override
	public void savingsAccount() {
		System.out.println("savings account rate is 10%");
		
	}

	@Override
	public void loanAccount() {
		System.out.println("loan account rate is 10%");
		
	}
	
	public static void main(String[] args) {
		StateBankLocal s = new StateBankLocal();
		s.currentAccount();
		s.savingsAccount();
		s.loanAccount();
		s.jewelLoan();
	}
}