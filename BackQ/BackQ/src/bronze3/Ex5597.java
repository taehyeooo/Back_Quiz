package bronze3;

import java.util.Scanner;

public class Ex5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] count = new boolean[31]; //출석번호 1~30을 사용하기 위해 크기를 31로 설정

        System.out.println("");
        for (int i = 0; i < 28 ; i++) {
            int studentNumber = scanner.nextInt();
            count[studentNumber] = true;
        }

        System.out.println("");
        for(int i = 1; i <= 30; i++){
            if(!count[i]){
                System.out.println(i);
            }
        }
    }
}
