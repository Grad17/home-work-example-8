import java.time.LocalDate;

public class Homework {

    public static void main(String[] args) {

        int currentYear = LocalDate.now().getYear();
        int clientOS1 = 0;
        int distance = 108;
        int limitation = 20;
        int stepDistance = 40;
        int numberDays = 1;

        leapYearOrNot(currentYear);
        checkSpecification(currentYear, clientOS1);
        int days = calculateDeliveryDays(distance, limitation, stepDistance, numberDays);
        System.out.println("Потребуется дней " + days);
    }
    private static void leapYearOrNot (int leapYear) {

        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " год является високосным.");
        } else {
            System.out.println(leapYear + " год не является високосным.");
        }
    }
    private static void checkSpecification(int currentYear, int clientOS1) {

        if (clientOS1 == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения Android по ссылке.");
        } else if (clientOS1 == 1 && currentYear < 2015) {
            System.out.println("Установите облегчнную версию для Android по ссылке.");
        }
        if (clientOS1 == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения iOS по ссылке.");
        } else if (clientOS1 == 0 && currentYear < 2015) {
            System.out.println("Установите облегчнную версию для iOS по ссылке.");
        }
    }
    private static int calculateDeliveryDays(int distance, int limitation, int stepDistance, int numberDays) {

        if ( distance > limitation) {
            numberDays += ((distance-limitation)/stepDistance);
            if ((distance-limitation)%stepDistance > 0){
                numberDays++;
            }
        }
        return numberDays;
    }
}
