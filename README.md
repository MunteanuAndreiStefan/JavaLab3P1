# JavaLab3P1

 The Portofolio Optimization Problem
A company must implement a software solution for creating its investment portofolio. A number of items, all having a name and a price, are taken into consideration, for example buildings, vehicles, jewels, etc. Each item type has a unique name and a price. Some items (called assets) have also defined a method for calculating their expected profit and only they will be considered for the final purchase. The profit factors are defined as:

    building: area / price
    vehicle: performance / price
    jewel: no profit method defined yet. 

The problem is to determine which assets to include in the portofolio such that:

    the total price does not exceed a given maximum value.
    the profit is as large as possible. 

Example:

  maximum value of the portofolio = 20
  available items:
     House 1: area = 27, price = 9 (profit factor = 3)
     House 2: area = 27, price = 9
     House 3: area = 64, price = 16 (profit factor = 4)
     Car 1, performance = 8, price = 4 (profit factor = 2)
     Car 2: performance = 8, price = 4
     Gold Diamond Ring: price = 2
  selected assets: Car1, Car2, House 1


    Create an object-oriented model of the problem. You should have at least the following classes Building, Vehicle, Jewel, extending the superclass Item.
    Create the interface Asset, describing only the items that have the computeProfit method.
    Create all the objects given in the example.

      Building h1 = new Building("House 1", 27, 9);
      Vehicle c1 = new Vehicle("Car 1", 8, 4);
      . ..

    Create the AssetManager class that will contain a set of items. Display all the items sorted by their names.

      AssetManager manager = new AssetManager();
      manager.add(h1, h2, h3);
      manager.add(c1, c2); 
      manager.add(ring);
      System.out.println("Items sorted by name: " + manager.getItems());

