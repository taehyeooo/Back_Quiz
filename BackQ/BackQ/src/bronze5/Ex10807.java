package bronze5;

import java.util.Scanner;

public class Ex10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hnum = scanner.nextInt();
        int num[] = new int[hnum];
        int cnt=0;

        for(int i=0; i<hnum; i++){
            num[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for(int i=0; i<hnum; i++){
            if(num[i]==v){
                cnt++;
            }
        }
        System.out.println(cnt);
        }
    }
