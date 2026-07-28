package com.loopsStatements.Examples;

public class MonthsOf2026 {
	public static void main(String[] args) {
        int year = 2026;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.println("January " + year);
                    break;
                case 2:
                    System.out.println("February " + year);
                    break;
                case 3:
                    System.out.println("March " + year);
                    break;
                case 4:
                    System.out.println("April " + year);
                    break;
                case 5:
                    System.out.println("May " + year);
                    break;
                case 6:
                    System.out.println("June " + year);
                    break;
                case 7:
                    System.out.println("July " + year);
                    break;
                case 8:
                    System.out.println("August " + year);
                    break;
                case 9:
                    System.out.println("September " + year);
                    break;
                case 10:
                    System.out.println("October " + year);
                    break;
                case 11:
                    System.out.println("November " + year);
                    break;
                case 12:
                    System.out.println("December " + year);
                    break;
                default:
                    System.out.println("Invalid month");
            }
        }
    }
}
