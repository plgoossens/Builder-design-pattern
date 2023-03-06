package step4;

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

    public static HouseBuilder createNewHouse(){
        return new HouseBuilder();
    }

    public static class HouseBuilder{
        private int windows;
        private int doors;
        private int rooms;
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasStatues;
        private boolean hasGarden;

        /**
         * We add methods to modify the instance fields of the HouseBuilder objects.
         */

        public HouseBuilder withWindows(int windows){
            this.windows = windows;
            return this;
        }

        public HouseBuilder withDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder withRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder withFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder withGarage() {
            this.hasGarage = true;
            return this;
        }

        public HouseBuilder withSwimmingPool() {
            this.hasSwimmingPool = true;
            return this;
        }

        public HouseBuilder withStatues() {
            this.hasStatues = true;
            return this;
        }

        public HouseBuilder withGarden() {
            this.hasGarden = true;
            return this;
        }
    }
}
