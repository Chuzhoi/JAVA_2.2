public class Main {

    public static void main(String[] args) {
        int check = 350;                   // начальный счёт
        int payment = 1250;               // сумма пополнения
        int amount = 100;                // делитель
        int bonus = payment / amount;   // бонус
        int total;                     // сумма на счету
        if (payment < 1000) {
            total = check + payment;
            System.out.println("Сумма на счете:" + total + " Начислено 0 бонусов");
        } else {
            total = check + payment + bonus;
            System.out.println("Сумма на счете:" + total + " Начислено бонусов:" + bonus);
        }
    }
}
