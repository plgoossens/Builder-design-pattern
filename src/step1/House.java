package step1;

/**
 * The constructor has many parameters.
 * The code when calling this constructor is hard to read and lacks of flexibility.
 */
public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final int floors;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    public House(int windows, int doors, int rooms, int floors, boolean hasGarage, boolean hasSwimmingPool, boolean hasStatues, boolean hasGarden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.floors = floors;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    public static void main(String[] args) {
        //House house = new House(7, 5, 2, true, false, false, true);
    }
}
