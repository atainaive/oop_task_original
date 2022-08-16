package module;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    protected final Product product;
    protected final int units;

    public AbstractPurchase(Product product, int units) {
        this.product = product;
        this.units = units;
    }

    protected abstract Euro getFinalCost(Euro baseCost);

    public Euro getCost() {
        Euro baseCost = product.getPrice().mul(units);
        Euro finalCost = getFinalCost(baseCost);

        return finalCost.round(RoundMethods.ROUND, 2);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ";" + product.toString() + ";" + units + ";" + this.getCost().toString();
    }

    public int compareTo(AbstractPurchase o) {
        return o.getCost().compareTo(getCost());
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AbstractPurchase) || (object == null)) {
            return false;
        }

        AbstractPurchase o = (AbstractPurchase) object;

        return this.product.equals(o.product) && units == o.units;
    }
}
