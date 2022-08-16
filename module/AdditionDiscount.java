package module;

public class AdditionDiscount extends AbstractPurchase {
    private final Euro expenses;

    public AdditionDiscount(Product product, int units, Euro expenses) {
        super(product, units);
        this.expenses = expenses;
    }

    @Override
    protected Euro getFinalCost(Euro baseCost) {
        return baseCost.add(expenses);
    }
}
