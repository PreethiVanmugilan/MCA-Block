package org.scanner;

public class Specifier {
	
	public void globalLevelAccess()
	{
		System.out.println("Global Level Access");
	}
	
	protected void globalLevelWithRestriction()
	{
		System.out.println("Global Level With Restriction");
	}
	
	void packageLevelAccess()
	{
		System.out.println("Package Level Access");
	}
	
	private void ClassLevelAccess()
	{
		System.out.println("Class Level Access");
	}
	
	public static void main(String[] args)
	{
		Specifier Access = new Specifier();
		Access.globalLevelAccess();
		Access.globalLevelWithRestriction();
		Access.packageLevelAccess();
		Access.ClassLevelAccess();
	}
}