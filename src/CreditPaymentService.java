public class CreditPaymentService {

    public int calculate(int amountCredit, int years) {
        double percentCredit = 9.99; // годовая процентная ставка
        double percentMonth = percentCredit / (12 * 100); // процентная ставка в месяц
        double totalMonth = years * 12; // количество месяцев
        double paymentMonth = amountCredit * percentMonth / (1 - Math.pow(1 + percentMonth, -totalMonth)); // расчет ежемесячного платежа
        return (int) paymentMonth;
    }
}