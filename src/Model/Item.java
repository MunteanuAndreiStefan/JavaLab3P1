package Model;

import java.lang.reflect.Method;

public abstract class Item {
    private String name;
    private int price;

    /**
     * Constructor for item class.
     * @param name - the object name.
     * @param price - the object price.
     */
    public Item(String name, int price){
        this.price=price;
        this.name=name;
    }

    /**
     * Getter for price.
     * @return - object name.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter getter for price.
     * @param price - the object price.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter for name.
     * @return - object name.
     */
    public String getName() {
        return name;
    }

    /**
     * compareTo function for to item objects.
     * @param other the object to be compared to
     * @return an int that is 0 in case both objects are equal.
     */
    public int compareTo(Item other) {
        int i = name.compareTo(other.name);
        if (i != 0)
            return i;

        return Float.compare(price, other.price);
    }

    public Boolean hasMethod()
    {
        if (this instanceof IAsset)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return new String (name + " " + price + "\n");
    }
}
