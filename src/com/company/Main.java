package com.company;

import java.util.Scanner;

public class Main {

    static int totalLocks = 0;
    static int totalStocks = 0;
    static int totalBarrels = 0;

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        int locks = 0;
        int stocks = 0;
        int barrels = 0;

        while (true) { // ask the user to input the items sold abd get the result recurrently
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter lock count please:");
            locks = scanner.nextInt();
            System.out.println("Enter lock count please:");
            stocks = scanner.nextInt();
            System.out.println("Enter lock count please:");
            barrels = scanner.nextInt();

            main.commission(locks,stocks,barrels);
        }
    }
    private void commission(int locks, int stocks, int barrels){

        double lockPrice = 45.0;
        double stockPrice = 30.0;
        double barrelPrice = 25.0;

        double lockSales = 0.0;
        double stockSales = 0.0;
        double barrelSales = 0.0;
        double sales = 0.0;

        double commission = 0.0;



        if(locks != -1){ //if locks == 1 the adding will be terminated

            Main.totalLocks = Main.totalLocks + locks;
            Main.totalStocks = Main.totalStocks + stocks;
            Main.totalBarrels = Main.totalBarrels + barrels; //update the item count
        }

        System.out.println("Locks sold:" + Main.totalLocks);
        System.out.println("Stocks sold:" + Main.totalStocks);
        System.out.println("Barrels sold:" + Main.totalBarrels);// print the value after the update

        lockSales = lockPrice * Main.totalLocks;
        stockSales = stockPrice * Main.totalStocks;
        barrelSales = barrelPrice * Main.totalBarrels;
        sales = lockSales + stockSales + barrelSales; // compute the sales

        System.out.println("Total Sales:" + sales);

        if(sales > 1800){ // compute the commission
            commission = 0.10 * 1000.0;
            commission = commission + 0.15 * 800.0;
            commission = commission + 0.20 * (sales - 1800.0);
        }else if(sales > 1000.0){
            commission = 0.10 * 1000.0;
            commission = commission + 0.15 * (sales - 1000.0);
        }else{
            commission = 0.10 * sales;
        }


        System.out.println("Commission:" + commission);

    }
}
