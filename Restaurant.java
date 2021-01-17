package workshop2solution;

import java.util.Scanner;

public class Restaurant {
    private Chef _mainChef;
    private Chef _sousChef;

    public Restaurant() {
        _mainChef = new Chef("Andy");
        _sousChef = new Chef("Aalia");
        this.createMenu();
    }
    public void createMenu(){
        _mainChef.setSignatureDish("cookies");
        _mainChef.setSignaturePrice(6);
        _sousChef.setSignatureDish("ice cream");
        _sousChef.setSignaturePrice(5);
    }

    public void seeMenu(){
        System.out.println(_mainChef.getSignatureDish() + ", "+ _mainChef.getSignaturePrice());
        System.out.println(_sousChef.getSignatureDish() + ", "+ _sousChef.getSignaturePrice());
        System.out.println("pasta, "+"30");
        System.out.println("");

        _mainChef.cook("pasta");
        System.out.println("");

        _sousChef.cook(_sousChef.getSignatureDish());
    }



}
