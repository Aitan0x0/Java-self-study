package Tasks;//reqemin tersini yazan kod (reverse)

import java.util.Scanner;

public class Task3 {
    public static int findNumReverse(int num) {
        int revNum = 0;

        while (num != 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
//        int num = 0;
        System.out.print("Istenilen natural eded daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%d ededinin tersi - %d", num, findNumReverse(num));
        scanner.close();
    }
}
