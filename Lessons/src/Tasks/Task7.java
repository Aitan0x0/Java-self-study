//Faktorialin tapilmasi

package Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Eded daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%d! = %d%n", num, calculateFactorial(num));
        scanner.close();
    }

    public static long calculateFactorial(int num) {
        long facNum = 1;
        for (int i = 1; i <= num; i++) {
            facNum *= i;
        }
        return facNum;
    }
}
