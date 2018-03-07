public class Vehicle extends Item implements IAsset {

    private float performance;

    /**
     * Default construct for Vehicle class.
     *
     * @param name  - the object name.
     * @param price - the object price.
     */
    public Vehicle(String name, float price) {
        super(name, price);
        performance = 0;
    }

    /**
     * Overloaded construct for item Vehicle.
     *
     * @param name  - the vehicle name.
     * @param price - the vehicle price.
     * @param performance - the vehicle performance.
     */
    public Vehicle(String name, float price, float performance) {
        super(name, price);
        this.performance = performance;
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
