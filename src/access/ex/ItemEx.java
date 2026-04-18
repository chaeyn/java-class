package access.ex;

public class ItemEx {
    private final String name;
    private final int price;

    public ItemEx(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름:" + this.name + ", 가격:" + this.price);
    }

    public int getPrice() {
        return this.price;
    }
}
