//Polindromun yoxlanilmasi (string ucun)

package Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Her hansi bir soz daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf(str + (isPolindromeString(str) ? " Polindromdur" : " Polindrom deyil"));
        scanner.close();
    }

    public static boolean isPolindromeString(String str) {

        for (int i = 0, j = str.length() - 1; i < str.length(); j--, i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
