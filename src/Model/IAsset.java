package Model;

public interface IAsset {
    /**
     * Function that calculates the profit.
     * @return returns the profit into our imaginary currency.
     */
    default int computeProfit()
    {
        return 0;
    }
    default float financialRisk()
    {
        return 0;
    }
    default int getPrice()
    {
        return ((Item)this).getPrice();
    }
}
