package BankManagementSystem;

public class Tester {

	public static void main(String[] args) {
		BankAccount s=new SavingAccount("ABC",1001,10000);
		BankAccount f=new FixDeposite("PQR",2001,25000);
		
		s.display();
		((SavingAccount)s).deposite(5000);
		
		f.display();
		((FixDeposite)s).withdraw(500);
	}

}
