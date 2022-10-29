import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Первая часть занятия по циклам

        System.out.println("Первая часть по теме циклы");


                       System.out.println( );


        System.out.println("Первое задание");

        for ( int i = 1; i <= 10; i++ ) {
            System.out.print(i + " ");
        }

                       System.out.println( );

        System.out.print("Второе задание");

                       System.out.println( );


        for ( int e = 10; e > 0 ; e--) {
            System.out.print(e + " ");
        }

                       System.out.println( );

        System.out.println("Третье задание");


        for ( int a = 0; a < 17; a+=2) {
            System.out.print(a + " ");
        }

                       System.out.println( );

        System.out.println("Четвертое задание");

        for ( int y = 10; y >= -10; y--) {
            System.out.print(y + " ");
        }

                       System.out.println( );

        System.out.println("Пятое задание");

        for (int f = 1904; f < 2096; f = f + 4) {
            System.out.println( f + " год является високосным");
        }

                       System.out.println( );

        System.out.println("Шестое задание");

        for (int d = 7; d <= 98; d = d + 7) {
            System.out.print(d + " ");
        }

                       System.out.println( );

        System.out.println("Седьмое задание");

        for (int r = 1; r <= 512; r = r * 2) {
            System.out.print(r + " ");
        }

                       System.out.println( );

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

                       System.out.println();

        //Вторая часть занятия по циклам

        System.out.println("Первая часть по теме циклы");

                       System.out.println();

        System.out.println("Первое задание");

        int payback2 = 15_000;
        int bank2 = 0;
        int m2 = 0;
        while ( bank2 <= 2_459_000){
            bank2 = bank2 + payback2;
            m2 = m2 + 1;
            System.out.println("Месяц " + m2 + " Итого " + bank2);}

        System.out.println("Второе задание");

        int u = 0;
        int p = 10;
        while (u < 10) {
            u = u + 1;
            System.out.print( u + " ");
        }
        System.out.println();
        for ( ; p >= 1; p--){
            System.out.print( p + " ");
        }

                       System.out.println();

        System.out.println("Третье задание");

        int totalPerson = 12_000_000;
        double birth = (double) 17 / 1000;
        double death = (double) 8 / 1000;
        int years = 0;
        while (years < 10) {
            totalPerson = (int) (totalPerson + (totalPerson * birth) - (totalPerson * death));
            years=years+1;
            System.out.println("Год " + years + ", численность населения составляет " + totalPerson);
        }

        System.out.println("Четвертое задание");

        int payback3 = 15000;
        int bank3 = 0;
        int m3 = 0;
        while ( bank3 <= 12_000_000 ){
            bank3 = (int) (bank3 + (bank3 * 0.07) + payback3);
            m3 = m3 + 1;
            System.out.println("Месяц " + m3 + " Итого " + bank3);
        }

        System.out.println("Пятое задание");

        int payback4 = 15000;
        int bank4 = 0;
        int m4 = 0;
        while ( bank4 <= 12_000_000 ) {
            bank4 = (int) (bank4 + (bank4 * 0.07) + payback4);
            m4 = m4 + 1;
            if (m4 % 6 == 0) {
                System.out.println("Месяц " + m4 + " Итого " + bank4);
            }
        }

        System.out.println("Шестое задание");

        int payback5 = 15000;
        int bank5 = 0;
        int m5 = 0;
        while ( m5 < 108 ) {
            bank5 = (int) (bank5 + (bank5 * 0.07) + payback5);
            m5 = m5 + 1;
            if (m5 % 6 == 0) {
                System.out.println("Месяц " + m5 + " Итого " + bank5);
            }
        }

        System.out.println("Седьмое задание");

        int friday = 3;
        for (int day = friday; day <= 31; day=day+7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        } // Можно было бы и подлинее через условие, но  это самый краткий вариант

        System.out.println("Восьмое задание");

        //Я НЕ ЗНАЮ, КАК ЭТО ДЕЛАТЬ!

        System.out.println("Девятое задание (Вариация с do-while)");

        int two = 2;
        int k = 0;
        do {
            k++;
            int multiplicationTable = two * k;

            System.out.println(two + " * " + k + " = " + multiplicationTable);
        }
        while (k<10);

        System.out.println("Девятое задание (Вариация с for)");

        int two2 = 2;
        for ( int k2 = 1 ; k2 <= 10; k2++) {
            int multiplicationTable = two2 * k2;

            System.out.println(two2 + " * " + k2 + " = " + multiplicationTable);
        }


    }
}