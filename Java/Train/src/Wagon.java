public class Wagon {
    private int actualPassengers;
    private final int maxPassengers; //owo

    public Wagon(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.actualPassengers = 0;
    }

    public int addPassengers(int passengers) {
        int remaining = this.actualPassengers + passengers - this.maxPassengers;
        if (this.actualPassengers + passengers > this.maxPassengers) {
            this.actualPassengers = this.maxPassengers;
        } else {
            this.actualPassengers += passengers;
        }
        return Math.max(remaining, 0);
    }

    public int removePassengers(int passengers) {
        int remaining = this.actualPassengers - passengers;
        if (remaining < 0) {
            this.actualPassengers = 0;
        } else {
            this.actualPassengers -= passengers;
        }
        return Math.min(remaining, 0);
    }

    public int getActualPassengers() {
        return this.actualPassengers;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }
}
