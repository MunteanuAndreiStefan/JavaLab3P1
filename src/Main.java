public class Main {

    public static void main(String[] args) {


        Building h1 = new Building("House 1", 27, 9);
        Vehicle c1 = new Vehicle("Car 1", 8, 4);
        Building h2 = new Building("House 2", 27, 9);
        Vehicle c2 = new Vehicle("Car 2", 8, 4);

        AssetManager manager = new AssetManager();
        manager.add(h1, h2);
        manager.add(c1, c2);

        manager.getItems();
    }
}
