 import java.util.*;
public class Storage<T extends WarehouseItem> {
	private ArrayList<T> list = new ArrayList<>();
	
	public void addItem(T item) {
		list.add(item);
	}
	
	public ArrayList<T> getItems(){
		return list;
	}
}