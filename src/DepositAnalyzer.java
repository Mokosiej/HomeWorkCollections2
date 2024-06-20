import java.util.List;

public class DepositAnalyzer {

    public void analyzeDeposits(List<Deposit> deposits) {
        double totalProfit = 0;
        double maxProfit = 0;
        Deposit bestDeposit = null;

        for (Deposit deposit : deposits) {
            double profit = deposit.calculateProfit();
            totalProfit += profit;
            System.out.printf("%s, Прибыль: %.2f%n", deposit.toString(), profit);
            if (profit > maxProfit) {
                maxProfit = profit;
                bestDeposit = deposit;
            }
        }

        double averageProfit = totalProfit / deposits.size();

        if (bestDeposit != null) {
            System.out.printf("Самый выгодный вклад: %s, Прибыль: %.2f%n", bestDeposit.toString(), maxProfit);
        }
        System.out.printf("Средняя прибыль с каждого вклада: %.2f%n", averageProfit);
    }
}

