import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "deposits.txt";
        FileInputReader fileReader = new FileInputReader(fileName);
        DepositAnalyzer analyzer = new DepositAnalyzer();


        long arrayListDuration = measureTimeAndAnalyze(fileReader, analyzer, new ArrayList<>());


        long linkedListDuration = measureTimeAndAnalyze(fileReader, analyzer, new LinkedList<>());


        System.out.printf("Время работы с ArrayList: %d наносекунд%n", arrayListDuration);
        System.out.printf("Время работы с LinkedList: %d наносекунд%n", linkedListDuration);
    }

    private static long measureTimeAndAnalyze(FileInputReader fileReader, DepositAnalyzer analyzer, List<Deposit> deposits) {
        long startTime = System.nanoTime();
        fileReader.readDeposits(deposits);
        long endTime = System.nanoTime();
        analyzer.analyzeDeposits(deposits);
        return endTime - startTime;
    }
}

