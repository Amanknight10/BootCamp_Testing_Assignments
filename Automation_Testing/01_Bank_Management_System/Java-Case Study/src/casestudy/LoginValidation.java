package casestudy;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualUsername = "admin";
        String enteredUsername = "admin";

        if (enteredUsername.equals(actualUsername)) {
            System.out.println("Username matched. Proceed to password check.");
        }
	}

}
