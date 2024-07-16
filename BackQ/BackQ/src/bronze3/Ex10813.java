package bronze3;

import java.util.Scanner;

public class Ex10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt(); // 바구니 총 갯수
        int M= scanner.nextInt(); // 공 바꾼 횟수
        int[] basket =new int[N]; // 바구니 배열
        for(int I=0;I<N;I++){
            basket[I] =I+1; //
        }
        for(int J=0;J<M;J++){
            int i= scanner.nextInt()-1;
            int j= scanner.nextInt()-1;
            int temp=0;
            temp=basket[i];
            basket[i] =basket[j];
            basket[j] =temp;
        }
        for(int J=0;J<N;J++){
            System.out.print(basket[J] + " ");
        }
    }
}
