package bronze5;

import java.util.Scanner;

public class Ex25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");

        int a = scanner.nextInt();

        int total = a/4;

        for(int i = 0; i < total ; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
