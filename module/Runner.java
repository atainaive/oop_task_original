package module;

public class Runner {

    public static void main(String[] args) {
        Product bread = new Product("Bread", new Euro(150));
        Product eggs = new Product("Eggs", new Euro(200));
        Product bacon = new Product("Bacon", new Euro(250));
        Product cheese = new Product("Cheese", new Euro(300));
        Product juice = new Product("juice", new Euro(350));
        Product pie = new Product("pie", new Euro(400));

        PurchaseArray purchaseArray = new PurchaseArray(
                new AbstractPurchase[]{
                        new AdditionDiscount(bread, 10, new Euro(420)),
                        new AdditionDiscount(eggs, 8, new Euro(85)),
                        new EveryDiscount(bacon, 7, new Euro(50)),
                        new EveryDiscount(cheese, 25, new Euro(40)),
                        new GreaterDiscount(juice, 2, 0.3),
                        new GreaterDiscount(pie, 16, 0.7)
                }
        );

        purchaseArray.printArr();

        purchaseArray.sort();

        System.out.println();

        purchaseArray.printArr();

        System.out.println("Minimal: " + purchaseArray.getMinimalCost());

        int key = purchaseArray.search(new Euro(500));

        if (key < 0) {
            System.out.println("None");
        } else {
            System.out.println(key);
        }

    }
}
