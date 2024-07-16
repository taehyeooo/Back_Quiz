package silver5;

import java.util.Scanner;

public class Ex2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        String[] croatianAlphabets = {"dž", "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        int length = 0;
        int i = 0;

        while (i < word.length()) {
            boolean found = false;
            for (String croAlpha : croatianAlphabets) {
                if (i + croAlpha.length() <= word.length() && word.substring(i, i + croAlpha.length()).equals(croAlpha)) {
                    length++;
                    i += croAlpha.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                length++;
                i++;
            }
        }

        System.out.println(length);
    }

}
