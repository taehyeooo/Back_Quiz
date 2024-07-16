package bronze3;

import java.util.Scanner;

public class Ex10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니 총 개수
        int m = scanner.nextInt(); // 공 넣는 횟수

        int[] basket = new int[n + 1]; // 0~n번 바구니 생성

        for (int a = 1; a <= m; a++) { // m번 실행
            int i = scanner.nextInt(); // i번 바구니부터
            int j = scanner.nextInt(); // j번 바구니까지
            int k = scanner.nextInt(); // k번 번호 공을 넣음
            for (int num = i; num <= j ; num++) { // num = 바구니 번호
                basket[num] = k; // num번 바구니에 k번 공을 넣음
            }
        }

        for (int b = 1; b <= n; b++) { // 1~n번 바구니까지 실행
            if (basket[b] != 0) {
                System.out.print(basket[b] + " ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
