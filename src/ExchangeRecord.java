import java.time.LocalDateTime;

public class ExchangeRecord {
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

