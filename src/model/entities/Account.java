package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimt() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainExceptions {
		if (amount > withdrawLimit) {
			throw new DomainExceptions("Withdraw error: The amount exceeds withdraw limit");
		}
		if (balance < amount) {
			throw new DomainExceptions("Withdraw error: Not enough balance");
		}
		balance -= amount;
	}
}
