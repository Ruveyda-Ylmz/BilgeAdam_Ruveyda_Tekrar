package Week02;

import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        //ödev cuma(15.03)
        //birden başlayarak kullamıcını dışarıdan girdiği sayıya kadar olan sayıların
        // bir fazlasının toplamını ekrana yazdıran algoritama.

        int sayi ,
            toplam=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for (int i=1 ; i<=sayi ; i++){
            toplam=toplam +(i+1);
        }
        System.out.println("kulanıcının girdiği sayı: "+sayi+"\n"+
                           "toplam deger: "+toplam);



    }
}
