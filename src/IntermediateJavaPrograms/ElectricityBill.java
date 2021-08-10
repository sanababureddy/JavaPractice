package IntermediateJavaPrograms;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Operation units is kWh");

        System.out.print("Consumer power usage hour per day: ");
        int load = in.nextInt();

        System.out.print("\n days to calculate: ");
        int days = in.nextInt();

        System.out.print("Price per unit: ");
        int price = in.nextInt();

        int total_consumed_units = load * 24 *days;
        int total_price = total_consumed_units * price;

        System.out.println("Bill : " + total_price);
/*
https://www.electricaltechnology.org/2012/03/lets-try-to-understand-calculation-of.html
 */


    }

}
