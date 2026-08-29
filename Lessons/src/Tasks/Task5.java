package Tasks;//Massivdeki ededlerin ededi ortasini tapan ve ededi ortadan boyuk ededleri print eden kod

import java.util.Scanner;

public class Task5 {
    /// Ededi ortanin tapilmasi
    ///
    /// @param nums
    /// @return
    public static double calculateAverage(int[] nums) {
        int  sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (double) sum / nums.length;

    }

    /// Ededi ortadan boyuk ededleri tapir
    ///
    /// @param nums
    public static void findGreaterThanAverage(int[] nums) {
        double avg = calculateAverage(nums);
        System.out.print("Ededi ortadan boyuk ededler: ");
        for (int num : nums) {
            if (num > avg) {
                System.out.print(num + " ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Massivin olcusunu daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] nums = new int[i];
        System.out.println("Massivi daxil edin:");
        for (int j = 0; j < nums.length; j++) {
            System.out.printf("Massivin [%d] elementi:%n", j);
            nums[j] = scanner.nextInt();
        }
        System.out.printf("Ededi ortala:%.2f%n", calculateAverage(nums));
        findGreaterThanAverage(nums);
        scanner.close();
    }
}
