public class Electronics extends WarehouseItem{
	public Electronics(String itemName) {
		super(itemName);
	}
	
	@Override
	public String getCategory() {
		return "Electronics";
	}
}