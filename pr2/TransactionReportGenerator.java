package pr2;
import java.util.List;

public abstract class TransactionReportGenerator {
    
    public static void printBalanceReport(double totalBalance) {
        System.out.println("Total balance: " + totalBalance);
    }

    public static void printTransactionsCountByMonth(String monthYear, int count) {
        System.out.println("Amount of transactions on " + monthYear + ": " + count);
    }

    public static void printTopExpensesReport(List<Transaction> topExpenses) {
        System.out.println("10 найбільших витрат:");
        for (Transaction expense : topExpenses) {
            System.out.println(expense.getDescription() + ": " + expense.getAmount());
        }
    }

    
}
