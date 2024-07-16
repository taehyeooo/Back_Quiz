package bronze3;

import java.util.Scanner;

public class Ex2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0; //최댓값 출력
        int count = 0; // 몇 번쨰 숫자 출력

        for (int i = 1; i < 10; i++) {
            int n = scanner.nextInt(); // 9개 자연수 출력
            if (n > max){ // 자연수가 max보다 클 떄
                max = n;
                count = i;
            }

        }
        System.out.println(max);
        System.out.print(count);
    }
}
