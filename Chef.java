package workshop2solution;

public class Chef {
    String _chefName;

    public Chef(String name) {
        _chefName = name;
        System.out.println("Hi, my name is Chef " + _chefName);
    }

    public void cook(String myOrder) {
        System.out.println("preparing " + myOrder);
        System.out.println("Finding ingredients!");
        System.out.println("Adding salt!");
        System.out.println("Plating!");
    }

    public int calculatePrice(int numberOfOrders) {
        System.out.println("Calculating price!");
        return numberOfOrders * 10;

    }

}
