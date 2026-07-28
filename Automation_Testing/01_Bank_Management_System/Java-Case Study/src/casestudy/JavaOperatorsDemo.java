package casestudy;

public class JavaOperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators - E-commerce example
        System.out.println(" Arithmetic Operators ");
        double laptopPrice = 50000;
        int quantity = 2;
        double total = laptopPrice * quantity;
        System.out.println("Total Price = " + total);

        // 2. Assignment Operators - Banking example
        System.out.println(" Assignment Operators ");
        int accountBalance = 10000;
        accountBalance += 500; // deposit
        System.out.println("Account Balance after deposit = " + accountBalance);

        // 3. Relational Operators - Voting System example
        System.out.println(" Relational Operators ");
        int age = 17;
        System.out.println("Is eligible to vote (age >= 18)? " + (age >= 18));

        // 4. Logical Operators - Internet Banking Login example
        System.out.println(" Logical Operators ");
        boolean username = true;
        boolean password = true;
        System.out.println("Login allowed (username && password)? " + (username && password));

        // 5. Increment/Decrement Operators - Website Visitor Counter
        System.out.println(" Increment/Decrement Operators ");
        int visitors = 250;
        visitors++;
        System.out.println("Visitor count after increment = " + visitors);

        // 6. Unary Operators - Account Lock Check
        System.out.println(" Unary Operators ");
        boolean accountLocked = false;
        System.out.println("Is account unlocked (!accountLocked)? " + (!accountLocked));

        // 7. Ternary Operator - Movie Ticket example
        System.out.println(" Ternary Operator ");
        int viewerAge = 15;
        String ticket = (viewerAge >= 18) ? "Adult Ticket" : "Child Ticket";
        System.out.println("Ticket type = " + ticket);

        // 8. Bitwise Operators
        System.out.println(" Bitwise Operators ");
        int a = 5;
        int b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));

        // 9. instanceof Operator
        System.out.println(" instanceof Operator ");
        Object obj = "Automation";
        if (obj instanceof String) {
            System.out.println("obj is a String object");
        }

        // ---------- Project Examples ----------
        System.out.println(" Project Examples ");

        // Banking Application - Loan Eligibility
        double balance = 25000;
        if (balance >= 10000) {
            System.out.println("Eligible for Personal Loan");
        }

        // E-commerce Discount
        double purchaseAmount = 6000;
        double discount = (purchaseAmount >= 5000) ? 500 : 0;
        System.out.println("Discount = " + discount);

        // Login Validation
        boolean loginUsername = true;
        boolean loginPassword = true;
        if (loginUsername && loginPassword) {
            System.out.println("Login Successful");
        }

        // Inventory Management
        int stock = 50;
        stock--;
        System.out.println("Remaining stock = " + stock);
    }
}