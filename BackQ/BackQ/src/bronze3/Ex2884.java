package bronze3;

import java.util.Scanner;

public class Ex2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m>=45) {
            m -= 45;
            System.out.println(h + " " + m);
        } else {
            m = 60 + m - 45;
            if(h==0) {
                h = 23;
                System.out.println(h + " " + m);
            } else {
                h -= 1;
                System.out.println(h + " " + m);
            }
        }
    }
}
