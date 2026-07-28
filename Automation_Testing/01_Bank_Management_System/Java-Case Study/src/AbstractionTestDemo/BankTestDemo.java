package AbstractionTestDemo;
abstract class Bank{
	public void Deposit() {
		System.out.println("Money Deposited");
	}
	public void withdraw() {
		System.out.println("Monay Withdrawn");
	}
	abstract void calculatInterest();
}
class SBI extends Bank{
	@Override
	void calculateInterest() {
		System.out.println("SBI Interset=6.5%");
	}
}
class HDFC extends Bank{
	void calculate Interest() {
		System.out.println("HDFC INTRESTSET=7%");
	}
}
public class BankTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SBI sbi=
	}

}
