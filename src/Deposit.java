public class Deposit {
    private double principal;
    private double interestRate;
    private int years;

    public Deposit(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateProfit() {
        return principal * Math.pow((1 + interestRate / 100), years) - principal;
    }

    @Override
    public String toString() {
        return String.format("Вклад: %.2f, Процент: %.2f%%, Годы: %d", principal, interestRate, years);
    }
}

