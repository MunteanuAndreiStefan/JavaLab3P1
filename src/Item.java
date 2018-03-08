import java.lang.reflect.Method;

public class Item {
    private String name;
    private int price;

    /**
     * Default construct for item class.
     * @param name - the object name.
     * @param price - the object price.
     */
    public Item(String name, int price){
        this.price=price;
        this.name=name;
    }

    /**
     * Default getter for price.
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
     * Default getter for name.
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
        /*Method methodToFind = null;
        try {
            methodToFind = Item.class.getMethod("computeProfit", (Class<?>[]) null);
        } catch (NoSuchMethodException | SecurityException e) {
        }
        if(methodToFind == null)
            return Boolean.FALSE;
        return Boolean.TRUE;*/
        boolean hasMethod = false;
        Method[] methods = this.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals("computeProfit")) {
                hasMethod = true;
                break;
            }
            //else System.out.println(m.getName());
        }
        return hasMethod;
    }

    @Override
    public String toString() {
        return new String (name + " " + price + "\n");
    }
}
