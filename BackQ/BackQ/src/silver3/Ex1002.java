package silver3;

import java.util.Scanner;

public class Ex1002 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt(); // 테스트 케이스의 수

            for (int i = 0; i < t; i++) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int r1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                int r2 = scanner.nextInt();

                int result = getNumberOfPoints(x1, y1, r1, x2, y2, r2);
                System.out.println(result);
            }

            scanner.close();
        }

        private static int getNumberOfPoints(int x1, int y1, int r1, int x2, int y2, int r2) {
            double distanceSquared = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
            double rSumSquared = Math.pow(r1 + r2, 2);
            double rDiffSquared = Math.pow(r1 - r2, 2);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                // 두 원이 동일한 경우
                return -1;
            } else if (distanceSquared > rSumSquared) {
                // 두 원이 서로 외부에 있는 경우
                return 0;
            } else if (distanceSquared < rDiffSquared) {
                // 한 원이 다른 원 내부에 있는 경우
                return 0;
            } else if (distanceSquared == rSumSquared || distanceSquared == rDiffSquared) {
                // 두 원이 한 점에서 만나는 경우 (외접 또는 내접)
                return 1;
            } else {
                // 두 원이 두 점에서 만나는 경우
                return 2;
            }
        }
    }

