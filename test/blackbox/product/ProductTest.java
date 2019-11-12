package blackbox.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void testRuntimePolymorphism() {
        Household newHouseholdItem = new Household("carpet", 12000);
        String expectedStr = "[Household]Product name: carpet | Price: 12000 x Qty: 4";
        assertEquals(expectedStr, newHouseholdItem.printBill(4));

        Grocery newGroceryItem = new Grocery("dish-set", 2100);
        expectedStr = "[Grocery][Household]Product name: dish-set | Price: 2100 x Qty: 1";
        assertEquals(expectedStr, newGroceryItem.printBill(1));

        Electronic newElectronicItem = new Electronic("headphone", 45000);
        expectedStr = "[Electronic]Product name: headphone | Price: 45000 x Qty: 2";
        assertEquals(expectedStr, newElectronicItem.printBill(2));
    }

    @Test
    void testCompileTimePolymorphism() {
        Product newItem = new Product("play-station 5", 50000);
        assertEquals(50000, newItem.amount());
        assertEquals(100000, newItem.amount(2));
    }
}