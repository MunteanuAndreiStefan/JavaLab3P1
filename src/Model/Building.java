package Model;

public class Building extends Item implements IAsset {

    private int area;

    /**
     * Constructor for Model.Building class.
     *
     * @param name  - the object name.
     * @param price - the object price.
     */
    public Building(String name, int price) {
        super(name, price);
    }

    /**
     * Overloaded construct for class Model.Building.
     *
     * @param name  - the building name.
     * @param price - the building price.
     * @param area - the area zone of the building..
     */
    public Building(String name, int price, int area) {
        super(name, price);
        this.area = area;
    }

    /**
     * Function that calculates the profit.
     *
     * @return returns the profit into our imaginary currency.
     */

    @Override
    public int computeProfit() {
        return area/getPrice();
    }
}
