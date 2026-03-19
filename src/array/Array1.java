package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 5개 int형 배열 선언

        students[0] = 1;
        students[1] = 2;
        students[2] = 3;
        students[3] = 4;
        students[4] = 5;

        System.out.println("학생1 번호: " + students[0]);
        System.out.println("학생2 번호: " + students[1]);
        System.out.println("학생3 번호: " + students[2]);
        System.out.println("학생4 번호: " + students[3]);
        System.out.println("학생5 번호: " + students[4]);
    }
}
