import Model.*;
import Solver.DPAlgorithm;

public class Main {

    public static void main(String[] args) {

        Building h1 = new Building("House 1", 27, 9);
        Vehicle c1 = new Vehicle("Car 1", 2, 5);
        Building h2 = new Building("House 2", 9, 27);
        Vehicle c2 = new Vehicle("Car 2", 1, 4);
        Jewel r1 = new Jewel("Ringo", 4);
        AssetManager manager = new AssetManager();
        manager.add(h1, h2);
        manager.add(c1, c2);
        manager.add(r1);
        System.out.println("Items sorted by name:\n" + manager.getItems());
        System.out.println("Assets sorted by profit:\n" + manager.getAssets());
        //manager.getItems();
        int maxValue = 3;
        Portofolio solution = manager.createPortofolio(new DPAlgorithm(), maxValue);
        System.out.println("The best portofolio: " + solution);
    }
}
