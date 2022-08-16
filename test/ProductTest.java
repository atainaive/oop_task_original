package test;

import module.Euro;
import module.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product test1 = new Product("test", new Euro(0));
    Product test2 = new Product("test", new Euro(0));
    Product test3 = new Product("test3", new Euro(3));

    @Test
    void AdditionTest(){
        assertEquals(test1, test2);
        assertNotEquals(test1,test3);
    }

    @Test
    void EveryDiscountTest(){
        assertEquals(test1, test2);
        assertNotEquals(test1,test3);
    }

    @Test
    void GreaterDiscountTest(){
        assertEquals(test1, test2);
        assertNotEquals(test1,test3);
    }
}
