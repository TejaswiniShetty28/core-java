package de.zeroco.restuarant.menu;

import java.util.HashMap;
import java.util.Map;
import de.zeroco.main.Utility;

/**
 * This class provides operations for managing a menu in a restaurant.
 * It allows for adding, removing, and updating items on the menu, as well as displaying the full menu.
 * The menu is represented as a Map where the key is the item name (String) and the value is the item price (Integer).
 * 
 * @author Tejaswini.S
 * @since 31-01-2025
 * @reviewed by 
 */
public class MenuOperation {
	
	/**
     * Adds a new item to the menu with the specified price.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param menu
	 * @param input
	 * @param price
	 * @return updated map after adding item.
	 * @reviewed by ,
	 */	
	public Map<String, Integer> addItem(Map<String, Integer> menu, String input, int price) {
        if (Utility.isBlank(input) || Utility.isBlank(price) || Utility.isBlank(menu)) return new HashMap<String, Integer>();
        menu.put(input, price);  
        return menu;
    }
	
	/**
     * Removes an item from the menu based on the provided item name.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param menu
	 * @param key
	 * @return updated map after removing item.
	 * @reviewed by ,
	 */	
	public Map<String, Integer> removeItem(Map<String, Integer> menu, String key) {
		if (Utility.isBlank(key) || Utility.isBlank(menu)) return new HashMap<String, Integer>();
		menu.remove(key);
		return menu;
	}
	
	/**
     * Updates the price of an item in the menu based on the provided item name.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param menu
	 * @param key
	 * @param price
	 * @return updated map after updating price.
	 * @reviewed by ,
	 */	
	public Map<String, Integer> updatePrice(Map<String, Integer> menu, String key, int price) {
		if (Utility.isBlank(menu) || Utility.isBlank(key) || Utility.isBlank(price)) return new HashMap<String, Integer>();
		menu.replace(key, price);
		return menu;
	}
	
	/**
     * Display all items along with price in menu.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param menu
	 * @return string of items in menu.
	 * @reviewed by ,
	 */	
	public String displayMenu(Map<String, Integer> menu) {
		if (Utility.isBlank(menu)) return new String();
		String res = "";
		for (Map.Entry<String, Integer> entry : menu.entrySet()) {
		    res += entry.getKey() + "                        " + "$" + entry.getValue() + "\n";
		}
		return res;
	}
}
