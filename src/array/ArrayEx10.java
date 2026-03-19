package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class ArrayEx10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] products = new String[10];
        int productOrder = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 입력하세요: ");
            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                if (productOrder > 9) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    return;
                }
                System.out.print("상품 이름을 입력하세요: ");
                String productName = br.readLine();

                System.out.print("상품 가격을 입력하세요: ");
                int productPrice = Integer.parseInt(br.readLine());

                products[productOrder] = productName + ": " + productPrice + "원";
                productOrder++;
            }

            if (choice == 2) {
                if (Arrays.stream(products).allMatch(Objects::isNull)) {
                    System.out.println("등록된 상품이 없습니다,");
                }
                for (String product : products) {
                    if (product != null) {
                        System.out.println(product);
                    }
                }
            }

            if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
