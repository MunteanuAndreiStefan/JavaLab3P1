import Model.Algorithm;
import Model.IAsset;
import Model.Item;
import Model.Portofolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class SortByProfit implements Comparator<IAsset>
{
    public int compare(IAsset a, IAsset b)
    {
        return a.computeProfit() - b.computeProfit();
    }
}

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

    //private void sortByProfit() {Collections.sort()}
    /**
     * Prints all items in order.
     */
    public String getItems(){
        sort();
        StringBuilder text = new StringBuilder();
        for(Item item : items){
            text.append(item.toString());
        }
        return (text.toString());
    }

    public String getAssets(){

        StringBuilder text = new StringBuilder();
        ArrayList<IAsset> assets = new ArrayList<IAsset>();
        assets=getAssetList();

        for(IAsset item : assets){
            text.append(item.toString());
        }
        return (text.toString());
    }

    public ArrayList<IAsset> getAssetList()
    {
        ArrayList<IAsset> assets = new ArrayList<IAsset>();
        for(Item item : items){
            if(item.hasMethod()) {
                IAsset asset= new IAsset() {
                };
                asset=(IAsset) item;
                assets.add(asset);
            }
        }
        Collections.sort(assets,new SortByProfit());
        Collections.reverse(assets);
        return assets;
    }

    public Portofolio createPortofolio(Algorithm algorithm, int maxValue)
    {
        Portofolio portofolio= new Portofolio(algorithm,maxValue, getAssetList());
        return portofolio;
    }
}
