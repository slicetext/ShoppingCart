public class Cart {
}

public static void main(String[] args){
    HashMap<String, Promo> validPromo = new HashMap<>();
    // Percentage-based Promos
    validPromo.put("SAVE10",     new Promo("SAVE10", 0.10, 0));
    validPromo.put("DEAL20",     new Promo("DEAL20", 0.20, 0));
    validPromo.put("QUARTEROFF", new Promo("QUARTEROFF", 0.25, 0));
    validPromo.put("TREAT30",    new Promo("TREAT30", 0.30, 0));
    validPromo.put("HALFOFF",    new Promo("HALFOFF", 0.50, 0));
    validPromo.put("SAVE15",     new Promo("SAVE15", 0.15, 0));
    validPromo.put("VIP100",     new Promo("VIP100", 1.00, 0));

    // Flat Value Promos
    validPromo.put("TENNER",     new Promo("TENNER", 0, 10));
    validPromo.put("TWENTYOFF",  new Promo("TWENTYOFF", 0, 20));
    validPromo.put("THIRTYGIFT", new Promo("THIRTYGIFT", 0, 30));
    validPromo.put("FORTYFREE",  new Promo("FORTYFREE", 0, 40));
    validPromo.put("FIFTYCLUB",  new Promo("FIFTYCLUB", 0, 50));
    validPromo.put("WELCOME5",   new Promo("WELCOME5", 0, 5));
    validPromo.put("CASHBACK",   new Promo("CASHBACK", 0, 100));

    // Mixed/Seasonal Format
    validPromo.put("SPRING25",   new Promo("SPRING25", 0.25, 0));
    validPromo.put("FREEOFF5",   new Promo("FREEOFF5", 0, 5));

    Inventory inventory = new Inventory();
    inventory.loadInventoryFromFile("inventory1.txt");


}
