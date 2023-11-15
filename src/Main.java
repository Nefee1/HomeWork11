import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        DefinitionLeapYear(2023);
    }
    public static void DefinitionLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        DefinitionOSVersions(1, 2016);
    }
    public static void DefinitionOSVersions(int OC, int year) {
        int currentYear = LocalDate.now().getYear();
        String mobileOS;
        switch (OC) {
            case 0:
                mobileOS = "Ios";
                break;
            case 1:
                mobileOS = "Android";
                break;
            default:
                mobileOS = "Ошибка OC";
        }

        if (year != currentYear) {
            System.out.println("Для ОС " + mobileOS + " Необходимо установить облегченную версию");
        } else {
            System.out.println("Для ОС " + mobileOS + " Необходимо установить Lite версию");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        OutputToTheConsoleNumberOfDays(95);
    }
    public static int DetermineDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void OutputToTheConsoleNumberOfDays(int deliveryDistance) {
        int days = DetermineDistance(deliveryDistance);

        if (days > 0) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }
}












