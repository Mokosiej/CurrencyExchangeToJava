import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        CurrencyExchange currencyExchange = new CurrencyExchange();
        ExchangeHistory exchangeHistory = new ExchangeHistory();

        while (true) {
            System.out.println("Введите сумму для обмена:");
            double amount = scanner.nextDouble();

            System.out.println("Введите валюту, которую хотите обменять (USD, EUR, GBP):");
            String fromCurrency = scanner.next().toUpperCase();

            System.out.println("Введите валюту, которую хотите приобрести (USD, EUR, GBP):");
            String toCurrency = scanner.next().toUpperCase();

            double result = currencyExchange.exchange(amount, fromCurrency, toCurrency);
            System.out.printf("Результат обмена: %.2f %s%n", result, toCurrency);

            exchangeHistory.addRecord(amount, fromCurrency, result, toCurrency);

            System.out.println("Хотите просмотреть историю обменов? (yes/no)");
            String response = scanner.next().toLowerCase();
            if (response.equals("yes")) {
                exchangeHistory.showHistory();
            }

            System.out.println("Хотите продолжить обмен? (yes/no)");
            response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                break;
            }
        }
    }
}


