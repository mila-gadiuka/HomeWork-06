public class Main {
    public static void main(String[] args) {

        //Первая часть занятия по циклам

        System.out.println("Первая часть по теме циклы");


        System.out.println();

        System.out.println("Домашнее задание - 01");

        System.out.println("Первое задание");

        for ( int i = 1; i <= 10; i++ ) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Второе задание");

        System.out.println();


        for ( int e = 10; e > 0 ; e--) {
            System.out.print(e + " ");
        }

        System.out.println();

        System.out.println("Третье задание");


        for ( int a = 0; a < 17; a+=2) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Четвертое задание");

        for ( int y = 10; y >= -10; y--) {
            System.out.print(y + " ");
        }

        System.out.println();

        System.out.println("Домашнее задание - 02");

        System.out.println("Первое задание");

        for (int f = 1904; f < 2096; f = f + 4) {
            System.out.println( f + " год является високосным");
        }

        System.out.println();

        System.out.println("Второе задание");

        for (int d = 7; d <= 98; d = d + 7) {
            System.out.print(d + " ");
        }

        System.out.println();

        System.out.println("Третье задание");

        for (int r = 1; r <= 512; r = r * 2) {
            System.out.print(r + " ");
        }

        System.out.println();

        System.out.println("Домашнее задание - 03");

        System.out.println("Первое задание");

        int monthlyDepositToYheBank = 29000;
        int bankAccount = 0;
        for ( int m = 1; m <= 12; m++){
            bankAccount = bankAccount + monthlyDepositToYheBank;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + bankAccount + " рублей");
        }

        System.out.println("Второе задание");

        int monthlyDepositToYheBank1 = 29000;
        int bankAccount1 = 0;
        for ( int m1 = 1; m1 <= 12; m1++){
            monthlyDepositToYheBank1 = monthlyDepositToYheBank1 + monthlyDepositToYheBank1/100;
            bankAccount1 = bankAccount1 + monthlyDepositToYheBank1;
            System.out.println("Месяц " + m1 + ", сумма накоплений равна " + bankAccount1 + " рублей");
        }

        System.out.println();

        //Вторая часть занятия по циклам

        System.out.println("Вторая часть по теме циклы");

        System.out.println();

        System.out.println("Домашнее задание - 01");

        System.out.println("Первое задание");
        // Цифры в названиях для того, чтобы не менять полностью названия переменных со схожими по значению задачами
        int monthlyDepositToYheBank2 = 15_000;
        int bankAccount2 = 0;
        int month2 = 0;
        while ( bankAccount2 <= 2_459_000){
            bankAccount2 = bankAccount2 + monthlyDepositToYheBank2;
            month2 = month2 + 1;
            System.out.println("Месяц " + month2 + " Итого " + bankAccount2);}

        System.out.println("Второе задание");

        int u = 0;
        while (u < 10) {
            u = u + 1;
            System.out.print( u + " ");
        }
        System.out.println();
        for (int p = 10; p >= 1; p--){
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
            years+=1;
            System.out.println("Год " + years + ", численность населения составляет " + totalPerson);
        }

        System.out.println("Домашнее задание - 02");

        double monthlyInterestRate0 = 0.07; //Общая процентвая ставка в месяц
        int monthlyDepositToYheBank0 = 15000; //Общая сумма депозита в месяц
        int month0 = 0; // Общее начало месяца
        int monthlyIncomeFromTheInitialDeposit0 = (int) (monthlyDepositToYheBank0 * monthlyInterestRate0); // Тот самый процент от суммы общий

        System.out.println("Первое задание");

        int bankAccount3 = 0;
        while ( bankAccount3 <= 12_000_000 ){
            month0+=1;
            bankAccount3 = (int) (bankAccount3 + (bankAccount3 * monthlyInterestRate0) + monthlyDepositToYheBank0 + monthlyIncomeFromTheInitialDeposit0);
            System.out.println("Месяц " + month0 + " Итого " + bankAccount3);
        }

        System.out.println("Второе задание");


        int bankAccount4 = 0;

        while ( bankAccount4 <= 12_000_000 ) {
            bankAccount4 = (int) (bankAccount4 + (bankAccount4 * monthlyInterestRate0) + monthlyDepositToYheBank0 + monthlyIncomeFromTheInitialDeposit0);
            month0+=1;
            if (month0 % 6 == 0) {
                System.out.println("Месяц " + month0 + " Итого " + bankAccount4);
            }
        }

        System.out.println("Третье задание"); // Ответ не выводится, не понимаю почему

        int numberOfMonthsInAYear = 12;
        int totalNumberOfYearsOfSavingMoney = 9;
        int totalNumberOfMonthsOfMoneySavings = totalNumberOfYearsOfSavingMoney * numberOfMonthsInAYear;

        int bankAccount5 = 0;

        while ( month0 < totalNumberOfMonthsOfMoneySavings ) {
            bankAccount5 = (int) (bankAccount5 + (bankAccount5 * monthlyInterestRate0) + monthlyDepositToYheBank0 + monthlyIncomeFromTheInitialDeposit0);
            month0+=1;
            if (month0 % 6 == 0) {
                System.out.println("Месяц " + month0 + " Итого " + bankAccount5);
            }
        }

        System.out.println("Четвертое задание");

        int friday = 3;
        for (int day = friday; day <= 31; day+=7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        } // Можно было бы и подлинее через условие, но  это самый краткий вариант

        System.out.println("Домашнее задание - 03");

        System.out.println("Первое задание");

        //Я НЕ ЗНАЮ, КАК ЭТО ДЕЛАТЬ!

        System.out.println("Второе задание (Вариация с do-while)"); // для повторения темы

        int two = 2;
        int k = 0;
        do {
            k++;
            int multiplicationTable = two * k;

            System.out.println(two + " * " + k + " = " + multiplicationTable);
        }
        while (k<10);

        System.out.println("Второе задание (Вариация с for)"); // по условию задания

        int two2 = 2;
        for ( int k2 = 1 ; k2 <= 10; k2++) {
            int multiplicationTable = two2 * k2;

            System.out.println(two2 + " * " + k2 + " = " + multiplicationTable);
        }


    }
}