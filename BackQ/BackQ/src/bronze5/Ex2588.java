package bronze5;

import java.util.Scanner;

public class Ex2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 =0, num2 =0;

        int total1 =0, total2 =0, total3 =0,total4 =0;

        num1 =scanner.nextInt();

        num2 = scanner.nextInt();

        total1 = num1 *((num2 % 100)%10);

        total2 = num1 *((num2 % 100)/10);

        total3 = num1 *(num2/100);

        total4 = num1*num2;

        System.out.println(total1);

        System.out.println(total2);

        System.out.println(total3);

        System.out.println(total4);
    }
}
