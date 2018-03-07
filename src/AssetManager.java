import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AssetManager {
    private ArrayList<Item> items = new ArrayList<Item>();

    /**
     * Add into Assets List any number of assets.
     * @param items any number of item.
     */
    public void add(Item ... items){
        this.items.addAll(Arrays.asList(items));
    }

    /**
     * sort the list
     */
    private void sort(){
        Collections.sort(items, Item::compareTo);
    }

    /**
     * Prints all items in order.
     */
    public void getItems(){
        sort();
        StringBuilder text = new StringBuilder();
        text.append("Items sorted by name: \n");
        for(Item item : items){
            text.append(item.toString());
        }
        System.out.println(text);
    }

}
