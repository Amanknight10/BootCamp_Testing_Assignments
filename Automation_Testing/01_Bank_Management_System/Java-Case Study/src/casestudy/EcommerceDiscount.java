package casestudy;

public class EcommerceDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cartTotal = 1500;

        if (cartTotal > 1000) {
            double discount = cartTotal * 0.10;
            System.out.println("Discount applied: " + discount);
        }
	}

}
