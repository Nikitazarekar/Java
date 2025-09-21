package BankManagementSystem;

public class FixDeposite implements  BankAccount{

	String accHolderName;
	int accNo;
	int balance;
	
	public FixDeposite(String accHolderName, int accNo, int balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.balance = balance;
	}
	public void deposite(int amt)
	{
		balance=balance+amt;
		System.out.println(amt+" deposited successfully !");
	}

	public void withdraw(int amt)
	{
		if(balance>amt)
		{
			balance=balance-amt;
			System.out.println(amt+" withdrawn successfully !");
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	@Override
	public double calInterest() {
		// TODO Auto-generated method stub
		return balance*0.07;
	}
	@Override
	public void display() {
		System.out.println("Account holedr Name:"+accHolderName);
		System.out.println("Account No:"+accNo);
		System.out.println("Interest rate:"+calInterest());
		
	}
	
	
}
