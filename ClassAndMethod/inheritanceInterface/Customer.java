package inheritanceInterface;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        Buy.super.order();
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }
}
