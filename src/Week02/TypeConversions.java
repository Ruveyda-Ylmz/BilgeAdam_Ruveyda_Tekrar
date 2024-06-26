package Week02;

public class TypeConversions {
    public static void main(String[] args) {
        //tip dönüşümleri
        //widennin casting -genişleyen tip
        //narrowing casting -daraltıcı döküm

        int dollar    =5;
        float dollarF = dollar;
        long dollarL  = dollar;

        System.out.println("dollar = " + dollar + "\n" +
                "dollarF = " + dollarF + "\n" +
                "dollarL = " + dollarL + "\n");

        //float 4 byte (9.0) , int 4 byte (9)
        float floatDollar = 13.5f;
        int intDollar = (int) floatDollar;

        System.out.println(floatDollar);
        System.out.println(intDollar);

        System.out.println("\n");

        //long 8 byte (9.0) , int 4 byte (9)
        long longDollar = 123456789101112L;
        int intDollar2 = (int)longDollar;

        System.out.println(longDollar);
        System.out.println(intDollar2);

        //toplam dönüşüm
        float number1 =5.0f;
        int toplam = (int) number1 + 5;

        System.out.println(toplam);

    }
}
