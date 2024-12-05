package pr2;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TransactionAnalyzerTest {
    @Test
    public void testCalculateTotalBalance() {

        Transaction transaction1 = new Transaction("2023-01-01", 100.0, "Дохід");
        Transaction transaction2 = new Transaction("2023-01-02", -50.0, "Витрата");
        Transaction transaction3 = new Transaction("2023-01-03", 150.0, "Дохід");
        List<Transaction> transactions = Arrays.asList(transaction1, transaction2, transaction3);

        double result = TransactionAnalyzer.calculateTotalBalance(transactions);

        Assertions.assertEquals(200.0, result, "Sum of total balance is incorrect");
    }
    @Test
    public void testCountTransactionsByMonth() {
        // Підготовка тестових даних
        Transaction transaction1 = new Transaction("01-02-2023", 50.0, "Дохід");
        Transaction transaction2 = new Transaction("15-02-2023", -20.0, "Витрата");
        Transaction transaction3 = new Transaction("05-03-2023", 100.0, "Дохід");
        List<Transaction> transactions = Arrays.asList(transaction1, transaction2, transaction3);

        // Створення екземпляру TransactionAnalyzer з тестовими даними

        int countFeb = TransactionAnalyzer.countTransactionsByMonth(transactions,"02-2023");
        int countMar = TransactionAnalyzer.countTransactionsByMonth(transactions,"03-2023");

        // Перевірка результатів
        Assertions.assertEquals(2, countFeb, "Amount of transactions for February is incorrect");
        Assertions.assertEquals(1, countMar, "Amount of transactions for March is incorrect");
    }

}
