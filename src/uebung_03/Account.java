package uebung_03;

public class Account {
	private Customer[] holders;
	private long balance;
	private String iban;
	
	public Account(String iban){
		setIban(iban);
	}
	
	public void setBalance(long balance){
		this.balance = balance;
	}
	public long getBalance(){
		return this.balance;
	}
	
	public void setIban(String iban){
		this.iban = iban;
	}
	public String getIban(){
		return this.iban;
	}
	
	public void setHolders(Customer[] holders) {
		this.holders = holders;
	}
	public Customer[] getHolders() {
		return holders;
	}


	
	
}
