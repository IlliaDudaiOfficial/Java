package pr2;

import lombok.AllArgsConstructor;
import lombok.Data;

public @AllArgsConstructor @Data class Transaction {
    private String date;
    private double amount;
    private String description;
}