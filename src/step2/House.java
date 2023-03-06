package step2;

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

    /**
     * We add a HouseBuilder nested class.
     */
    public static class HouseBuilder{
        private int windows;
        private int doors;
        private int rooms;
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasStatues;
        private boolean hasGarden;


    }
}
