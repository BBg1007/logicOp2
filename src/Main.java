public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Задача №1");
        System.out.println();
        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println();

        //Task2
        System.out.println("Задача №2");
        System.out.println();
        short clientDeviceYear = 2014;
        if (clientOS) {
            if ((clientDeviceYear - 2015) >= 0) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientDeviceYear - 2015 >= 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }
        System.out.println();

        //Task 3
        System.out.println("Задача №3");
        System.out.println();
        short year = 2024;
        short yearPassed = (short) (year - 1584);
        if (yearPassed > 0){
            if ((yearPassed%4==0)&&(yearPassed%100!=0)||yearPassed%400==0){
                System.out.println(year+" год является высокосным.");
            }
            else {
                System.out.println(year+" год не является высокосным.");
            }
        }
        else {
            System.out.println("Год должен быть больше, чем 1584 (в котором был введен високосный год).");
        }
        System.out.println();

        //Task 4
        System.out.println("Задача №4");
        System.out.println();
        byte deliveryDistance = 95;
        byte deliveryDays;
        if (deliveryDistance<=20&&deliveryDistance>=0){
           deliveryDays=1;
            System.out.println("Потребуется дней: "+deliveryDays);
        }
        else if (deliveryDistance>20&&deliveryDistance<=60) {
            deliveryDays=2;
            System.out.println("Потребуется дней: "+deliveryDays);
        } else if (deliveryDistance>60&&deliveryDistance<=100) {
            deliveryDays=3;
            System.out.println("Потребуется дней: "+deliveryDays);
        }
        else {
            System.out.println("К сожалению, доставки нет.");
        }
        System.out.println();

        //Task5
        System.out.println("Задача №5");
        System.out.println();
        byte monthNumber=12;
        switch (monthNumber){
            case 12: case 1: case 2:
                System.out.println("Текущий сезон - зима.");
                break;
            case 3: case 4: case 5:
                System.out.println("Текущий сезон - весна.");
                break;
            case 6: case 7: case 8:
                System.out.println("Текущий сезон - лето.");
                break;
            case 9: case 10: case 11:
                System.out.println("Текущий сезон - осень.");
                break;
            default:
                System.out.println("Номер месяца должен быть от 1 до 12.");
        }


    }

}