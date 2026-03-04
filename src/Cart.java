import java.util.HashMap;

public class Cart {
    void initializeCart(Inventory inventory, HashMap<Promo> validPromo) {}
    void addItem(int itemId, int quantity) {}
    void removeItem(int itemId, int quantity) {}
    void applyPromoCode(String codeString) {}
    float checkout() throws CartError {}
}