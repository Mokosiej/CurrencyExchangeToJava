import java.util.HashMap;
import java.util.Map;

public class CurrencyExchange {
    private ExchangeRateProvider exchangeRateProvider;

    public CurrencyExchange() {
        this.exchangeRateProvider = new ExchangeRateProvider();
    }

    public double exchange(double amount, String fromCurrency, String toCurrency) {
        double rate = exchangeRateProvider.getRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}

