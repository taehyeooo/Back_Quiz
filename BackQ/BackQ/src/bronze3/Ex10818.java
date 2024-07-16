package bronze3;

import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        int max = a[0];

        for(int i=1; i<n; i++) {
            if(min>a[i]) min = a[i];
            if(max<a[i]) max = a[i];
        }
        System.out.println(min + " " + max);
    }
    }
