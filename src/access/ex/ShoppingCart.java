package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public ShoppingCart() {
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            this.items[this.itemCount] = item;
            this.itemCount++;
        }
    }

    public void displayItems() {
        int priceSum = 0;

        for (int i = 0; i < this.itemCount; i++) {
            priceSum += this.items[i].getPrice();
            System.out.println("상품명: " + this.items[i].getName() + ", 합계: " + priceSum);
        }

        System.out.println("전체 가격 합: " + priceSum);
    }
}
