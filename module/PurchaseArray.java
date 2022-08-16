package module;

import java.util.Arrays;
import java.util.Comparator;

public class PurchaseArray {
    private final AbstractPurchase[] purchases;

    public PurchaseArray(AbstractPurchase[] purchases) {
        this.purchases = purchases;
    }

    public void sort() {
        Arrays.sort(purchases);
    }

    public int search( Euro searchValue) {
        Comparator<AbstractPurchase> comparator = AbstractPurchase::compareTo;

        return Arrays.binarySearch(
                purchases,
                new GreaterDiscount(new Product(null, new Euro(searchValue)), 1, 0.10),
                comparator);
    }

    public Euro getMinimalCost() {
        return purchases[purchases.length - 1].getCost();
    }

    public void printArr() {
        for(AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PurchaseArray) || (object == null)) {
            return false;
        }

        PurchaseArray o = (PurchaseArray) object;

        return Arrays.equals(this.purchases, o.purchases);
    }
}
