package mobileOperators;

public class mobileOperatorsService {
    public static void main(String[] args) {
        double currentBalance = 100; // Начальная сумма на счету клиента
        double topUpAmount = 1100; // Сумма пополнения счета

        double bonusPer100Rubles = 1; // Бонус за каждые полные 100 рублей пополнения
        double bonusThreshold = 1000; // Порог для начисления бонуса
        double bonus = 0; // Количество бонусных рублей
        if (topUpAmount > bonusThreshold) {
            bonus = (topUpAmount / 100) * bonusPer100Rubles;
        }
        double totalBalance = currentBalance + topUpAmount + bonus; // Рассчитываем итоговый счет клиента

        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");

    }
}
