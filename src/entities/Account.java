package entities;

public class Account {
	// Atributos 
	private int number;
	private String holder;
	private double balance;
	
	// Construtor 
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double inicialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
	}

	// Métodos especiais 
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	// Métodos públicos
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Accout " + getNumber() + ", Holder: " +getHolder() + ", Balance: $ " + String.format("%.2f", getBalance());
	}
}
