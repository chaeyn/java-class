package cond;

import java.util.Scanner;

public class ConditionEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        int rate = 1300;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * rate;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
}