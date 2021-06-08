package uebung_03;

public class Bank {
	private String name;
	private Account[] accounts;
	
	public Bank(String name)
	{
		setName(name);
	}
	
	public String getName(){
		return this.name;		
	}
	public void setName(String name){
		this.name = name;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public Account[] getAccounts() {
		return accounts;
	}	

}
