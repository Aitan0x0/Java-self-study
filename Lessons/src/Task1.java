//1-den 100-e qeder 3e ve 5e bolunen ededleri ve onlarin cemini ekrana yazmaq

public class Task1 {
    static void main(String[] args) {
    int sum = 0;
        System.out.print("1-den 100-e qeder 3e ve 5e bolunen ededler:");
        for (int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5== 0){
                sum=sum+i;
                System.out.print(" "+i);
            }

        }
        System.out.println();
        System.out.print("Hemin edelerin cemi: "+ sum);
    }
}
