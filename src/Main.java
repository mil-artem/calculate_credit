public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 1) + " рублей");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 2) + " рублей");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 3) + " рублей");
    }
}