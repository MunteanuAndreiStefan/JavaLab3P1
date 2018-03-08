import java.util.ArrayList;


public class DPAlgorithm implements  Algorithm{
    @Override
    public int solve(int maxValue, ArrayList<IAsset> assets) {
        int[][] dp= new int[assets.size()+1][maxValue+1];
        int n=assets.size();
        for(int i=1;i<=n;i++)
        {
            for(int w=0;w<=maxValue;w++)
            {
                dp[i][w]=dp[i-1][w];
                if(assets.get(i-1).getPrice()<=w)
                    dp[i][w]=max(dp[i][w],dp[i-1][w-assets.get(i-1).getPrice()]+ assets.get(i-1).computeProfit());
            }
            //System.out.println( assets.get(i-1).computeProfit());
        }
        return dp[n][maxValue];
    }
    public int max(int a, int b)
    {
        if(a>b)
            return a;
        return b;
    }
}
