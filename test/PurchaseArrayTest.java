package test;

import module.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseArrayTest {
    private final Product testProduct = new Product("test", new Euro(100));

    private final PurchaseArray testArr = new PurchaseArray(
            new AbstractPurchase[]{
                    new AdditionDiscount(testProduct, 5, new Euro(50)),
                    new EveryDiscount(testProduct, 2, new Euro(10)),
                    new GreaterDiscount(testProduct, 4,0.5)
            });

    private final PurchaseArray sortedTestArr = new PurchaseArray(
            new AbstractPurchase[]{
                    new AdditionDiscount(testProduct, 5, new Euro(50)),
                    new GreaterDiscount(testProduct, 4,0.5),
                    new EveryDiscount(testProduct, 2, new Euro(10))
            }
    );


    @Test
    void validateSort(){
        testArr.sort();
        assertEquals(sortedTestArr, testArr);
    }

}
