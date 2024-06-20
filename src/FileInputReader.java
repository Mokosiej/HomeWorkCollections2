import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileInputReader {
    private String fileName;

    public FileInputReader(String fileName) {
        this.fileName = fileName;
    }

    public void readDeposits(List<Deposit> deposits) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                double principal = Double.parseDouble(data[0]);
                double interestRate = Double.parseDouble(data[1]);
                int years = Integer.parseInt(data[2]);
                deposits.add(new Deposit(principal, interestRate, years));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
    }
}
