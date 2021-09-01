package workshop2solution;

public class Chef {
    private String signatureDish;
    private int signaturePrice;

    public Chef(String name) {
        System.out.println("Hi, my name is Chef " + name);
        this.signatureDish = "toast";
        this.signaturePrice = 0;
    }

    public void cook(String myOrder) {
        System.out.println("preparing " + myOrder);
        System.out.println("Finding ingredients!");
        System.out.println("Adding salt!");
        System.out.println("Plating!");
    }

    public int getSignaturePrice(){
        return this.signaturePrice;
    }

    public void setSignaturePrice(int price){
        this.signaturePrice = price;

    }
    public void setSignatureDish(String dish){
        this.signatureDish = dish;
    }

    public String getSignatureDish(){
        return this.signatureDish;
    }

}
