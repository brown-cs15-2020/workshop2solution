package workshop2solution;

import java.util.Scanner;

public class Restaurant {
    Chef _mainChef;
    Chef _sousChef;
    int _numberOfOrders;

    public Restaurant() {
        _mainChef = new Chef("Andy");
        _sousChef = new Chef("Aalia");
        _numberOfOrders = 0;
    }

    public void takeOrder() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nWhat would you like to eat? ");
        _mainChef.cook(myScanner.nextLine());
        _numberOfOrders +=1;
    }

    public void getCheck() {
        System.out.println("\nYour total is $" + _sousChef.calculatePrice(_numberOfOrders));
    }
}
