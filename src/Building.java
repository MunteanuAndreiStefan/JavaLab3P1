public class Building extends Item implements IAsset {

    private int area;

    /**
     * Default construct for Building class.
     *
     * @param name  - the object name.
     * @param price - the object price.
     */
    public Building(String name, float price) {
        super(name, price);
    }

    /**
     * Overloaded construct for class Building.
     *
     * @param name  - the building name.
     * @param price - the building price.
     * @param area - the area zone of the building..
     */
    public Building(String name, float price, int area) {
        super(name, price);
        this.area = area;
    }

    /**
     * Function that calculates the profit.
     *
     * @return returns the profit into our imaginary currency.
     */

    @Override
    public float computeProfit() {
        return 0;
    }
}
