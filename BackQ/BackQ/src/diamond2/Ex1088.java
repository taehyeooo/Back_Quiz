package diamond2;

import java.util.Scanner;

public class Ex1088 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
