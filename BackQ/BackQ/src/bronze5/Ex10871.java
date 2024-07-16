package bronze5;

import java.util.Scanner;

public class Ex10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] num = new int[a];

        for(int i = 0; i<a ; i++){
            num[i] = scanner.nextInt();
            if(num[i] < b){
                System.out.println(num[i]);
            }

        }
    }
}
