package construct;

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public Book() {
        this.title = "";
        this.author = "";
        this.pages = 0;
    }

    public void displayInfo() {
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.pages);
    }
}

public class ClassElementEx3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 70);
        book3.displayInfo();
    }
}
