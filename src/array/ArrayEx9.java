package array;

import java.io.IOException;
import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) throws IOException {
        int[][] students = new int[3][4];
        students[0] = new int[]{85, 70, 90, 95};;
        students[1] = new int[]{80, 95, 90, 70};
        students[2] = new int[]{75, 85, 90, 80};

        int[] sums = new int[3];
        sums[0] = Arrays.stream(students[0]).sum() / students[0].length;
        sums[1] = Arrays.stream(students[1]).sum() / sums.length;
        sums[2] = Arrays.stream(students[2]).sum() / sums.length;


        for (int i = 0; i < 3; i++) {
            System.out.println("학생 " + (i + 1) + ": " + students[i] + "|" + "평균: " + sums[i]);
        }
    }
}
