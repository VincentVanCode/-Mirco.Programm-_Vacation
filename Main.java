package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double peopleCount = Double.parseDouble(scanner.nextLine());
        String typeOfVisitors = scanner.nextLine().toLowerCase();
        String dayOfVisit = scanner.nextLine().toLowerCase();
        double price = 0.0;
        double totalPrice = 0.0;
        if (typeOfVisitors.equals("students")) {
            if (dayOfVisit.equals("friday")) {
                price += 8.45;
            } else if (dayOfVisit.equals("saturday")) {
                price += 9.80;
            } else if (dayOfVisit.equals("sunday")) {
                price += 10.46;
            }
            totalPrice += peopleCount * price;
            if (peopleCount >= 30) {
                totalPrice *= 0.85;
                System.out.printf("Total price: %01.2f", totalPrice);
            } else {
                System.out.printf("Total price: %01.2f", totalPrice);
            }
        } else if (typeOfVisitors.equals("business")) {
            if (dayOfVisit.equals("friday")) {
                price += 10.90;
            } else if (dayOfVisit.equals("saturday")) {
                price += 15.60;
            } else if (dayOfVisit.equals("sunday")) {
                price += 16;
            }
            totalPrice += peopleCount * price;
            if (peopleCount >= 100) {
                totalPrice -= (peopleCount * 10);
                System.out.printf("Total price: %01.2f", totalPrice);
            } else {
                System.out.printf("Total price: %01.2f", totalPrice);
            }
        } else if (typeOfVisitors.equals("regular")) {
            if (dayOfVisit.equals("friday")) {
                price += 15;
            } else if (dayOfVisit.equals("saturday")) {
                price += 20;
            } else if (dayOfVisit.equals("sunday")) {
                price += 22.50;
            }
            totalPrice += peopleCount * price;
            if (peopleCount >= 10 && peopleCount <= 20) {
                totalPrice *= 0.95;
                System.out.printf("Total price: %01.2f", totalPrice);
            } else {
                System.out.printf("Total price: %01.2f", totalPrice);
            }

        }
    }
}
