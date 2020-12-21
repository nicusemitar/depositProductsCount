public class Inventory {
    private String name;
    private Integer amount;

    Inventory(String name, Integer amount) {
        this.amount = amount;
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}


