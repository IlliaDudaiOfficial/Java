package pr1;
import lombok.AllArgsConstructor;
import lombok.Data;

//apparently @Data is supposed to generate a constructor automatically but it didn't seem to work
//using @AllArgsConstructor seemed to solve the issue though - D

public @AllArgsConstructor @Data class Product{
    private int id;
    private String name;
    private double price;
    private String description;
    private Category category;
}