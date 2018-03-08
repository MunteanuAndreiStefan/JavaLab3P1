package Model;

import java.util.ArrayList;

public class Portofolio {
    ArrayList<IAsset> assets;
    int maxValue;
    Algorithm algorithm;
    public Portofolio(Algorithm algorithm, int maxValue, ArrayList<IAsset> assets)
    {
        this.algorithm=algorithm;
        this.maxValue=maxValue;
        this.assets=assets;
    }
    public int getSolution()
    {
        return algorithm.solve(maxValue,assets);
    }
    public String toString() {
        return Integer.toString(getSolution());
    }
}
