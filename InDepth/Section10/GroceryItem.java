package InDepth.Section10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    } 

    public static void main(String[] args) {

        Object[] groceryItems = new Object[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("Bread", "BAKERY", 2);
        groceryItems[2] = new GroceryItem("Eggs", "PRODUCE", 12);
        System.err.println(Arrays.toString(groceryItems));

        ArrayList objecList = new ArrayList();
        objecList.add(new GroceryItem("Butter"));
        objecList.add(new GroceryItem("Cheese", "DAIRY", 5));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        
    }

}



