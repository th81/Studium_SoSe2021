package uebung_03;

public class Customer {
	private String name;
	private Account[] accounts;
	private Address homeAddress;
	private Address workAddress;
	
	public void setHomeAddress(Address address){
		this.homeAddress = address;
	}
	public Address getHomeAddress(){
		return this.homeAddress;
	}
	
	public void setWorkaddress(Address address){
		this.workAddress = address;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public Account[] getAccounts() {
		return accounts;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
		public Address getWorkAddress(){
		return this.workAddress;
	}
}
