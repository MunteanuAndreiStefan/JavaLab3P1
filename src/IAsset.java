public interface IAsset {
    /**
     * Function that calculates the profit.
     * @return returns the profit into our imaginary currency.
     */
    public default int computeProfit()
    {
        return 0;
    }
    public default float financialRisk()
    {
        return 0;
    }
    public default int getPrice()
    {
        return ((Item)this).getPrice();
    }
}
