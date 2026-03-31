 public class Groceries extends WarehouseItem{
	public Groceries(String itemName) {
		super(itemName);
	}
	@Override
	public String getCategory() {
		return "Groceries";
	}
}