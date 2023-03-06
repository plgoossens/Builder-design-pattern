package step5;

public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final int floors;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    /**
     * The constructor of House only takes a HouseBuilder object now.
     */

    private House(HouseBuilder houseBuilder) {
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.rooms = houseBuilder.rooms;
        this.floors = houseBuilder.floors;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasStatues = houseBuilder.hasStatues;
        this.hasGarden = houseBuilder.hasGarden;
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

        /**
         * The build() method returns a new House containing all the datas from the HouseBuilder object.
         */

        public House build(){
            return new House(this);
        }
    }
}
