import java.util.ArrayList;
import java.util.List;

public class ExchangeHistory {
    private List<ExchangeRecord> history;

    public ExchangeHistory() {
        this.history = new ArrayList<>();
    }

    public void addRecord(double amount, String fromCurrency, double result, String toCurrency) {
        ExchangeRecord record = new ExchangeRecord(java.time.LocalDateTime.now(), amount, fromCurrency, result, toCurrency);
        history.add(record);
    }

    public void showHistory() {
        for (ExchangeRecord record : history) {
            System.out.println(record);
        }
    }
}
