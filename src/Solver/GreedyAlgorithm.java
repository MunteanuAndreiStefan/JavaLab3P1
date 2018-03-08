package Solver;

import Model.Algorithm;
import Model.IAsset;
import Model.Item;

import java.util.ArrayList;

public class GreedyAlgorithm implements Algorithm {
    @Override
    public int solve(int maxValue, ArrayList<IAsset> assets) {
        int currentValue=maxValue;
        int totalProfit=0;
        for(IAsset asset: assets)
        {
            if(currentValue-((Item)asset).getPrice()<0)
                break;
            else
            {
                totalProfit+=asset.computeProfit();
                currentValue-=((Item)asset).getPrice();
            }
        }
        return totalProfit;
    }
}
