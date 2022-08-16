package module;

public class GreaterDiscount extends AbstractPurchase {
    private final static int GIVEN_AMOUNT = 15;
    private final double discount;

    public GreaterDiscount(Product product, int units, double discount) {
        super(product, units);
        this.discount = discount;
    }

    @Override
    protected Euro getFinalCost(Euro baseCost) {
        if (units > GIVEN_AMOUNT) {
            return baseCost.mul(1 - discount / 100, RoundMethods.ROUND, 0);
        }
        return baseCost;
    }
}
