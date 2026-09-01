//istifadeci melumatlarinin nizamlanmasi (hazir string uzerinden)

package Tasks;


import java.util.Locale;

public class Task9 {
    public static void main(String[] args) {
        String input = "  aYteN ;  QuRBAnoVa ;  +994501234567 ;  Aytan.qurBAnOva@GMAIL.com  ";
        stringFormat(input);

    }

    public static String onlyFirstLetterUp(String str) {
        String cleanedStr = str.trim();
        String lowerStr = cleanedStr.toLowerCase().substring(1);

        return cleanedStr.toUpperCase().charAt(0) + lowerStr;
    }

    public static String phoneNumberHide(String str) {
        String cleanedStr = str.trim();

        String stars = "";
        //repeat() ile de yazmaq olar return "*".repeat(sayi) ;0
        for (int i = 0; i < cleanedStr.length() - 4; i++) {
            stars += "*";
        }
        return stars + cleanedStr.substring(cleanedStr.length() - 4, cleanedStr.length());
    }

    public static void stringFormat(String str) {
        String[] strArray = str.split(";");
//        System.out.println(strArray);
        String name = onlyFirstLetterUp(strArray[0]);
        String lastName = onlyFirstLetterUp(strArray[1]);
        String phoneNum = phoneNumberHide(strArray[2]);
        String email = strArray[3].trim().toLowerCase();

        System.out.printf("Ad ve Soyad: %s %s%nPhone: %s%nEmail: %s%n", name, lastName, phoneNum, email);
    }
}

