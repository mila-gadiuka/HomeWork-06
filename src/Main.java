public class Main {
    public static void main(String[] args) {

        System.out.println("Первая часть по теме циклы");

        System.out.println("Первое задание");

        for ( int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }

        System.out.println("Второе задание");

        for ( int e = 10; e > 0 ; e--) {
            System.out.println(e);
        }

        System.out.println("Третье задание"); //ДОДЕЛАТЬ!

        for ( int a = 0; a < 17; a+=2) {
            System.out.println(a);
        }

        System.out.println("Четвертое задание");

        for ( int y = 10; y >= -10; y--) {
            System.out.println(y);
        }

        System.out.println("Пятое задание");

        for (int f = 1904; f < 2096; f = f + 4) {
            System.out.println( f + " год является високосным");
        }

        System.out.println("Шестое задание");

        for (int d = 7; d <= 98; d = d + 7) {
            System.out.println(d);
        }

        System.out.println("Седьмое задание");

        for (int r = 1; r <= 512; r = r * 2) {
            System.out.println(r);
        }

        System.out.println("Восьмое задание");

        int payback = 29000;
        int bank = 0;
        for ( int m = 1; m <= 12; m++){
            bank = bank + payback;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + bank + " рублей");
        }

        System.out.println("Девятое задание");

        int payback1 = 29000;
        int bank1 = 0;
        for ( int m1 = 1; m1 <= 12; m1++){
            payback1 = payback1 + payback1/100;
            bank1 = bank1 + payback1;
            System.out.println("Месяц " + m1 + ", сумма накоплений равна " + bank1 + " рублей");
        }
    }
}