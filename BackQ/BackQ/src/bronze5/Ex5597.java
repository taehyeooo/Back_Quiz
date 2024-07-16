package bronze5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[30];
        int min = 9999;
        int max = 0;

        for (int i = 1; i <= 30; i++) {
            array[i - 1] = i;
        }
        Arrays.sort(array);
        for (int j = 1; j <= 28; j++) {
            int b = scanner.nextInt();

            for (int a = 1; a <= array.length; a++) {

                if (array[a - 1] == b) {
                    array[a - 1] = 0;
                    break;
                }
            }
        }


        for (int k = 0; k < array.length; k++) {

            if (array[k] != 0) {
                if (min > array[k]) min = array[k];
                if (min < array[k]) max = array[k];

            }



        }
        System.out.println(min);
        System.out.println(max);


        }

    }
