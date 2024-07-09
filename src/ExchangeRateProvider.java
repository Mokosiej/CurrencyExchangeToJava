import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProvider {
    private Map<String, Double> rates;

    public ExchangeRateProvider() {
        this.rates = new HashMap<>();
        // Зафиксированные курсы обмена
        rates.put("USD_EUR", 0.85);
        rates.put("EUR_USD", 1.18);
        rates.put("USD_GBP", 0.75);
        rates.put("GBP_USD", 1.33);
        rates.put("EUR_GBP", 0.88);
        rates.put("GBP_EUR", 1.14);
    }

    public double getRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return 1.0;
        }
        String key = fromCurrency + "_" + toCurrency;
        return rates.getOrDefault(key, 1.0);
    }
}

