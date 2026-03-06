package cond;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이템 가격과 나이를 입력하세요 (예: 15000 8): ");
        int price = sc.nextInt();
        int age = sc.nextInt();

        if (price >= 10000) {
            price -= 1000;
        }
        if (age <= 10) {
            price -= 1000;
        }

        System.out.println(price);
    }

}
