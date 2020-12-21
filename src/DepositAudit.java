import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepositAudit {
    public static void main(String... args) {

        Inventory first = new Inventory("Fork", 10);
        Inventory second = new Inventory("Plate", 10);
        Inventory third = new Inventory("Car", 10);
        Inventory fourth = new Inventory("Knife", 6);

        Map<String, Integer> countTotalProductsInDeposit = countTotalProductsInDeposit(Arrays.asList(first, second, third,
                second, first, third, third, fourth, fourth));

        System.out.println("In deposit we have:");
        for (Map.Entry<String, Integer> entry : countTotalProductsInDeposit.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> countTotalProductsInDeposit (List<Inventory> inventories) {
        Map<String, Integer> audit = new HashMap<>();
        for (Inventory inventory : inventories) {
            if (audit.containsKey(inventory.getName())) {
                Integer updatedAmount = (audit.get(inventory.getName()) + inventory.getAmount());
                audit.put(inventory.getName(), updatedAmount);
            } else {
                audit.put(inventory.getName(), inventory.getAmount());
            }
        }
        return audit;
    }
}