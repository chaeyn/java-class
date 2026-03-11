package cond;

import java.util.Scanner;

public class ConditionEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        if (grade.equals("A")) {
            System.out.println("탁월한 성과입니다.");
        } else if (grade.equals("B")) {
            System.out.println("좋은 성과입니다.");
        } else if (grade.equals("C")) {
            System.out.println("준수한 성과입니다.");
        } else if (grade.equals("D")) {
            System.out.println("향상이 필요합니다.");
        } else if (grade.equals("F")) {
            System.out.println("불합격입니다.");
        } else {
            System.out.println("잘못된 학점입니다.");
        }
    }
}