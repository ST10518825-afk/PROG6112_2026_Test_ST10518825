/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consolesalesreport;


public class ConsoleSalesReport {

    
    public static void main(String[] args) {
        // 1D arrays for labels
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // 2D array for sales data
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // Display Header
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");
        
        // Print column headers
        System.out.printf("%-16s%-12s%-12s%-12s\n", "", consoles[0], consoles[1], consoles[2]);
        
        // Print sales per city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s%-12d%-12d%-12d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
            
        }
        
        System.out.println("\n----------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");
        
        int maxSales = 0;
        String topCity = "";
        
        // Calculate and display total sales per city
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
                
            }
            
            // Print formatted city total
            System.out.printf("%-16s%d\n", cities[i], cityTotal);
            
            // Track city with highest sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
                
            }
        }
        
        // Display top performing city
        System.out.println("\n------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------------------");
        
    }
    
}
