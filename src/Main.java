public class Main {
    public static void main(String[] args) {
        int balance = 150; // Начальный счет
        int payment = 999; // Сумма пополнения
        int bonus = payment / 100; // Бонус

        if (payment > 1000) {
            System.out.println(balance + payment + bonus + " - Итоговый баланс");
            System.out.println(bonus + " - Количество бонусных рублей");
        } else {
            System.out.println(balance + payment + " - Итоговый баланс");
            System.out.println("0 - Количество бонусных рублей");
        }
    }
}
