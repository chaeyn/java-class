package class1;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void info() {
        System.out.println(title + " - " + author + " / 가격: " + price + "원");
    }
}
