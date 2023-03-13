package exceptionSession;

public class CustomExceptionExample {
     static int currentAmount=100;
     //when user deposit amount 
	public static int creditbalance(int amount) {
		return currentAmount+amount;
	}
	//when user withdraw amount
	public static int debitbalance(int amount) {
		return currentAmount-amount;
		
	}
	public static int debitbalance1(int amount) {
	if(currentAmount < amount) {
		try {
		 throw new InsufficientFundException("Insufficient Balance");
		}
		catch(InsufficientFundException e) {
			e.printStackTrace();
			System.out.println("Insufficientnfund");
		}
		
	}
		else {
			
		}
	      return 0;
	}
	public static void main(String[] args) throws InsufficientFundException {
		// TODO Auto-generated method stub
		System.out.println(debitbalance1(220));

		
		
		
	}

}
