package bronze4;

import java.util.Scanner;

public class Ex25304 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("");
            int X = scanner.nextInt();
            int n = scanner.nextInt();
            int total = 0;

            for(int i = 0; i < n; ++i) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                total += a * b;
            }

            if (total == X) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

