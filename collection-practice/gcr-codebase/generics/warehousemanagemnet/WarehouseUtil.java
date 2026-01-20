 
import java.util.*;

public class WarehouseUtil {
	public static void displayItems(ArrayList<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getItemName() + " | Category: " + item.getCategory());
        }
    }
}