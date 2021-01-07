package workshop2solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant theVilla = new Restaurant();
        //DO NOT TOUCH THE BELOW CODE!
        System.out.print("How many people are ordering? ");
        Scanner keyboard = new Scanner(System.in);
        String numberOfOrders = keyboard.next();
        int num = Integer.parseInt(numberOfOrders);
        for(int i=0; i < num; i++) {
            theVilla.takeOrder();
        }
        theVilla.getCheck();
    }
}
