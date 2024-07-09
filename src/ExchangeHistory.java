import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExchangeHistory {
    private List<ExchangeRecord> history;

    public ExchangeHistory() {
        this.history = new ArrayList<>();
    }

    public void addRecord(double amount, String fromCurrency, double result, String toCurrency) {
        ExchangeRecord record = new ExchangeRecord(LocalDateTime.now(), amount, fromCurrency, result, toCurrency);
        history.add(record);
    }

    public void showHistory() {
        for (ExchangeRecord record : history) {
            System.out.println(record);
        }
    }
}

class ExchangeRecord {
    private LocalDateTime dateTime;
    private double amount;
    private String fromCurrency;
    private double result;
    private String toCurrency;

    public ExchangeRecord(LocalDateTime dateTime, double amount, String fromCurrency, double result, String toCurrency) {
        this.dateTime = dateTime;
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.result = result;
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        return "Дата и время: " + dateTime +
                ", Сумма: " + amount +
                ", Из валюты: " + fromCurrency +
                ", В валюту: " + toCurrency +
                ", Результат: " + result;
    }
}

