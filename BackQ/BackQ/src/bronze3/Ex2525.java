package bronze3;

import java.util.Scanner;

public class Ex2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("");
        int c = scanner.nextInt();

       int min = 60 * a + b;
       min += c;

       int hour = (min / 60) % 24;
       int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
