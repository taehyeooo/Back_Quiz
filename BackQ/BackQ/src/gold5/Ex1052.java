package gold5;

import java.util.Scanner;

public class Ex1052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(minimumBottlesToAdd(N, K));
    }

    public static int minimumBottlesToAdd(int N, int K) {
        int additionalBottles = 0;

        while (Integer.bitCount(N) > K) {
            N++;
            additionalBottles++;
        }

        return additionalBottles;
    }
    }
