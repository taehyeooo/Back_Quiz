package bronze5;

import java.util.Scanner;

public class Ex14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt();
        System.out.print("");
        int b = scanner.nextInt();

        if(a > 0 && b > 0){
            System.out.println("1");
        }else if (a < 0 && b > 0){
            System.out.println("2");
        }else if (a < 0 && b < 0){
            System.out.println("3");
        }else if (a > 0 && b < 0){
            System.out.println("4");
        }
    }
}
