public class Jewel extends Item implements IAsset {

    /**
     * Default construct for Jewel class.
     *
     * @param name  - the object name.
     * @param price - the object price.
     */
    public Jewel(String name, float price) {
        super(name, price);
    }

    /**
     * Function that calculates the profit.
     * @return returns the profit into our imaginary currency.
     */
    @Override
    public float computeProfit() {
        return 0;
    }
}
