package workshop2solution;

public class Restaurant {
    private Chef mainChef;
    private Chef sousChef;

    public Restaurant() {
        this.mainChef = new Chef("Andy");
        this.sousChef = new Chef("Lila");
        this.createMenu();
    }
    public void createMenu(){
        this.mainChef.setSignatureDish("cookies");
        this.mainChef.setSignaturePrice(6);
        this.sousChef.setSignatureDish("ice cream");
        this.sousChef.setSignaturePrice(5);
    }

    public void seeMenu(){
        System.out.println(this.mainChef.getSignatureDish() + ", "+ this.mainChef.getSignaturePrice());
        System.out.println(this.sousChef.getSignatureDish() + ", "+ this.sousChef.getSignaturePrice());
        System.out.println("pasta, "+"30");
        System.out.println("");

        this.mainChef.cook("pasta");
        System.out.println("");

        this.sousChef.cook(this.sousChef.getSignatureDish());
    }
}
