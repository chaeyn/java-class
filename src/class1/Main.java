package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("책 제목을 입력하세요: ");
        String title = br.readLine();

        System.out.print("저자를 입력하세요: ");
        String author = br.readLine();

        System.out.print("가격을 입력하세요: ");
        int price = Integer.parseInt(br.readLine());

        Book book = new Book(title, author, price);

        book.info();
    }
}
