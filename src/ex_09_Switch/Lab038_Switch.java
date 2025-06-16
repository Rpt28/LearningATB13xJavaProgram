package ex_09_Switch;

import java.util.Scanner;

public class Lab038_Switch {
    public static void main(String[] args) {
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error


        // int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break; //if we don't use break, all the next output will be printed too.
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
        System.out.println("Enter the browser, Which you want to start!!");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
        char ch = 'A';
        switch (ch) {

            case 65:
                System.out.println("Match ASCII");
                break;
//            case 65:
//                System.out.println("Match ASCII");
//                break;// duplicate casing not allowed.
            default:
                System.out.println("No Match");
        }
    }
}
