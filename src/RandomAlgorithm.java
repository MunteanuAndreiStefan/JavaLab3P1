import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomAlgorithm implements Algorithm {
    @Override
    public int solve(int maxValue, ArrayList<IAsset> assets) {
        int currentValue=maxValue;
        int totalProfit=0;
        while(!assets.isEmpty())
        {
            Random random=new Random();
            int i=random.nextInt(assets.size());
            IAsset asset=assets.get(i);
            if(currentValue-((Item)asset).getPrice()<0)
                assets.remove(i);
            else
            {
                totalProfit+=asset.computeProfit();
                currentValue-=((Item)asset).getPrice();
                assets.remove(i);
            }
        }
        return totalProfit;
    }


}
