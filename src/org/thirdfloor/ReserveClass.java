package org.thirdfloor;

public class ReserveClass implements ReserveBank, StateBankInt{

	@Override
	public void currentAccount() {
		System.out.println("savings account rate is 15%");
		
	}

	@Override
	public void savingsAccount() {
		
		System.out.println("savings account rate is 20%");
		
	}
	public static void main(String[] args) {
		ReserveClass r = new ReserveClass();
		r.currentAccount();
		r.savingsAccount();
		
	}
} 