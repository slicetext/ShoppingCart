import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class CartTest {
    @Test
    void applyInvalidPromoCode() {
        Cart cart = new Cart();
        Inventory inventory = new Inventory();
        inventory.loadInventoryFromFile("inventory1.txt");
        HashMap<String, Promo> validPromo = new HashMap<>();
        validPromo.put("SAVE10",     new Promo("SAVE10", 0.10, 0));
        cart.initializeCart(inventory, validPromo);
        cart.applyPromoCode("EVIL10");
        assertThrows(CartError.class, cart::checkout);
    }
    void applyValidPromoCode() {
        Cart cart = new Cart();
        Inventory inventory = new Inventory();
        inventory.loadInventoryFromFile("inventory1.txt");
        HashMap<String, Promo> validPromo = new HashMap<>();
        validPromo.put("SAVE10",     new Promo("SAVE10", 0.10, 0));
        cart.initializeCart(inventory, validPromo);
        cart.addItem(101, 1);
        cart.applyPromoCode("SAVE10");
        assertEquals(23.391, cart.checkout());
    }
}
