package bronze5;

import java.util.Scanner;

public class Ex10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int A = scanner.nextInt();
        System.out.print("");
        int B = scanner.nextInt();
        System.out.print("");
        int C = scanner.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);
    }
}
