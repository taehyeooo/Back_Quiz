package bronze4;

import java.util.Scanner;

public class Ex2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a==b) && (b==c)) {
            System.out.println(10000 + a*1000);
        } else if(a==b && a!=c) {
            System.out.println(1000 + a*100);
        } else if(a==c && a!=b) {
            System.out.println(1000 + a*100);
        } else if(b==c && b!=a) {
            System.out.println(1000 + b*100);
        } else {
            if(a>b && a>c) System.out.println(a*100);
            else if(b>a && b>c) System.out.println(b*100);
            else System.out.println(c*100);
        }
    }
}
