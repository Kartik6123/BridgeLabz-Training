package UnitTesting.UnitTesting;

import java.util.*;


import java.util.List;

public class ListManager {

    // Add element to list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Remove element from list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); 
        // Integer.valueOf() ensures we remove by value, not index
    }

    // Return list size
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
