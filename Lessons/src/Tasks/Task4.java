package Tasks;//Ededin polindrom olub-olmamsinin teyini

import java.util.Scanner;

public class Task4 {
    /// Ededin reverse'nu tapir
    ///
    /// @param num
    /// @return
    public static int findNumReverse(int num) {
        int revNum = 0;
        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }

    /// Polindrom olub olmamasini tapir
    ///
    /// @param num
    /// @return true or false
    public static boolean isPolindrom(int num) {
      return num == findNumReverse(num);

    }

    public static void main(String[] args) {
        System.out.print("Her hansi bir natural eded daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%d ededi %s%n", num, isPolindrom(num) ? "Polindromdur" : "Polindrom deyil");
        scanner.close();
    }
}
