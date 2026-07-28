package casestudy;

public class BankBalanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 5000;
        double withdrawAmount = 2000;

        if (balance >= withdrawAmount) {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - withdrawAmount));
        }
	}

}
