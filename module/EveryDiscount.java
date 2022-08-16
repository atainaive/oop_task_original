package module;

public class EveryDiscount extends AbstractPurchase{
    private final Euro discount;

    public EveryDiscount(Product product, int units, Euro discount) {
        super(product, units);
        this.discount = discount;
    }

    @Override
    protected Euro getFinalCost(Euro baseCost) {
        return baseCost.sub(discount.mul(units));
    }
}
