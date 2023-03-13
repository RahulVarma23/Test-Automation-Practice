package exceptionSession;

public class Bank {
	static int CurrentAmount = 0;

	public static void deposit(int amount) throws InsufficientFUnd {
		//withdraw(100);
		System.out.println("Updated Balance : " + (CurrentAmount + amount));
	}

	public static void withdraw(int amount) throws  WithdrawlException, InsufficientFUnd {
		
		if(CurrentAmount ==0) {
			throw new WithdrawlException("Balance is zero");
		}
		if (CurrentAmount < amount) {
			//System.out.println("Updated Balance : " + (CurrentAmount - amount));
		throw new WithdrawlException("Low balance");
		}
		
		

	}

	public static void main(String[] args) throws  WithdrawlException, InsufficientFUnd {
		// TODO Auto-generated method stub
		//deposit(100);
		withdraw(200);
	}

}
