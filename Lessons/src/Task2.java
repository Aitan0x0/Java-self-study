//massivdeki max elementi qaytaran kod

import java.util.Scanner;

public class Task2 {
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    };
public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massivin olcusunu daxil edin: ");
        i = scanner.nextInt() ;
        int[] arr = new int[i];
        System.out.println("Massivi daxil edin:");
        for (int j = 0; j < arr.length ; j++) {
            System.out.print("Massivin ["+j+"] indexli elementi: ");
            arr[j]= scanner.nextInt();
//            System.out.println();
        }
        System.out.print("Massivin max elementi:" + findMax(arr));
        scanner.close();
    }
}
