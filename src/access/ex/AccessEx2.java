package access.ex;

public class AccessEx2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("마늘", 2000, 2));
        cart.addItem(new Item("상추", 3000, 4));
        cart.displayItems();
    }
}
