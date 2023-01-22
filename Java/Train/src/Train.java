public class Train {
    private final Wagon[] wagons;

    public Train(int numOfWagons, int maxPassengers) {
        wagons = new Wagon[numOfWagons];
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = new Wagon(maxPassengers);
        }
    }

    public void getPassengers() {
        for (int i = 0; i < wagons.length; i++) {
            System.out.println("Vagone " + i + ": " + wagons[i].getActualPassengers() + " passeggeri");
        }
    }

    public int getTotalPassengers() {
        int total = 0;
        for (Wagon wagon : wagons) {
            total += wagon.getActualPassengers();
        }
        return total;
    }


    public int getMaxPassengers() {
        int total = 0;
        for (Wagon wagon : wagons) {
            total += wagon.getMaxPassengers();
        }
        return total;
    }

    public void addPassengers(int passengers) {
        int remaining = passengers;
        for (Wagon wagon : wagons) {
            remaining = wagon.addPassengers(remaining);
            if (remaining == 0) {
                break;
            }
        }
    }

    public void removePassengers(int passengers) {
        int remaining = passengers;
        for (Wagon wagon : wagons) {
            remaining = wagon.removePassengers(Math.abs(remaining));
            if (remaining == 0) {
                break;
            }
        }
    }
}
