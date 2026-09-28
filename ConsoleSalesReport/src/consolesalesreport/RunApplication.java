/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolesalesreport;

import java.util.Scanner;

// Main application class to run the console prompt
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Selection menu matching the sample screenshot
        System.out.println("Select the console device type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Selection: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear newline character from buffer

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown";
                break;
        }

        // Prompt inputs matching sample screenshot
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate ConsoleSales object and print the report
        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);
        report.printReport();

        scanner.close();
    }
}

