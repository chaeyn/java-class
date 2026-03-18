package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = Integer.parseInt(br.readLine());

            if (option == 1) {

                System.out.print("상품명을 입력하세요: ");
                String productName = br.readLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = Integer.parseInt(br.readLine());

                System.out.print("구매 수량을 입력하세요: ");
                int count = Integer.parseInt(br.readLine());

                sum += price * count;
                System.out.println("상품명: " + productName + " 가격: " + price + " 수량: " + count + " 합계: " + price * count);
            }

            else if (option == 2) {
                System.out.println("총 비용: " + sum);
                sum = 0;
            }

            else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}