package workshop2solution;

public class Chef {
    private String _signatureDish;
    private int _signaturePrice;

    public Chef(String name) {
        System.out.println("Hi, my name is Chef " + name);
        _signatureDish = "toast";
        _signaturePrice = 0;
    }

    public void cook(String myOrder) {
        System.out.println("preparing " + myOrder);
        System.out.println("Finding ingredients!");
        System.out.println("Adding salt!");
        System.out.println("Plating!");
    }

    public int getSignaturePrice(){
        return _signaturePrice;
    }

    public void setSignaturePrice(int price){
        _signaturePrice = price;

    }
    public void setSignatureDish(String dish){
        _signatureDish = dish;
    }

    public String getSignatureDish(){
        return _signatureDish;
    }

}
