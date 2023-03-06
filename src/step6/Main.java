package step6;

public class Main {

    public static void main(String[] args) {
        //House house = new House(4, 2, 1, 1, false, false, false, false);

        House smallHouse = House.createNewHouse()
                .withWindows(4)
                .withRooms(2)
                .withDoors(1)
                .withFloors(1)
                .build();

        House mansion = House.createNewHouse()
                .withWindows(46)
                .withDoors(14)
                .withFloors(4)
                .withRooms(30)
                .withGarden()
                .withStatues()
                .withGarage()
                .withSwimmingPool()
                .build();

        System.out.println("Small House: \n" + smallHouse);
        System.out.println("Mansion: \n" + mansion);
    }

    /**
     * Pros:
     *  - Construct objects step-by-step
     *  - Can reuse the same construction code when building various representations of products
     *  - Single responsability principle : You can isolate complex construction code from the business logic of the product
     *
     * Cons:
     *  - The overall complexity of the code increases
     */
}
