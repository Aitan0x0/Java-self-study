//Daxil edilen bala uygun qiymetin cixarilmasi
package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
//        int score = 0;
        System.out.print("Balinizi daxil edin (100-0 arasi):");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.print("Cavabiniz:");
        findGrade(score);
        scanner.close();
    }
    public static void findGrade(int score){
        if(score>100 || score<0){
            System.out.println("duzgun bal daxil edilmeyib");
        }
        else if(score>90){
            System.out.print("A");
        } else if(score>80){
            System.out.print("B");
        } else if(score>70){
            System.out.print("C");
        } else if(score>60){
            System.out.print("D");
        } else if(score>50){
            System.out.print("E");
        }
        else{
            System.out.println("Kesilmisiniz");
        }

    }

}
