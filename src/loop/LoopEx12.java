package loop;

public class LoopEx12 {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        System.out.print(ch + " ");
                        ch++;
                        break;
                    case 1:
                        if (j < 2) {
                            System.out.print(ch + " ");
                            ch++;
                        } else {
                            System.out.print(num + " ");
                            num++;
                        }
                        break;
                    case 2:
                        if (j == 0) {
                            System.out.print(ch + " ");
                        } else {
                            System.out.print(num + " ");
                            num++;
                        }
                        break;
                }
            }
            System.out.println();
        }
    }
}