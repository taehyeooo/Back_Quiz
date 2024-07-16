package bronze5;

import java.util.Scanner;

public class Ex2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
                System.out.println(a + " * " + i+ " = " + (a * i));
            }
        }
}
