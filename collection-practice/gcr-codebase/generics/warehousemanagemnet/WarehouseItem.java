 
public abstract class WarehouseItem {
	private String itemName;
	
	public WarehouseItem(String itemName) {
		this.itemName = itemName;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public abstract String getCategory();
}