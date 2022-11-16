import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Number,ilkSayi=0,IkinciSayi=1,Toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç elemanlı olsun: ");
        Number = input.nextInt();
        System.out.print(ilkSayi+",");
        for(int i=0;i<=Number;i++){
            Toplam = ilkSayi+ IkinciSayi;
            ilkSayi =IkinciSayi;
            IkinciSayi = Toplam;
            System.out.print(ilkSayi+",");
        }

    }
}