import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        ExchangeHistory exchangeHistory = new ExchangeHistory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите сумму обмена");
            double amount = scanner.nextDouble();

            System.out.println("Введите валюту которую хотите обменять");
            String fromCurrency = scanner.next();

            System.out.println("Введите валюту которую хотите приобрести");
            String toCurrency = scanner.next();

            double result = currencyExchange.exchange(amount, fromCurrency, toCurrency);
            exchangeHistory.addRecord(amount, fromCurrency, result, toCurrency);

            exchangeHistory.showHistory();
        }}}