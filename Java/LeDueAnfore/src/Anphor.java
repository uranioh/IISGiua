public class Anphor {
    private final int totalCapacity;
    private int actualCapacity;

    public Anphor(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int addWater(int liters) {
        int maxLiters = actualCapacity + liters;
        if (maxLiters > totalCapacity) {
            actualCapacity = totalCapacity;
            return maxLiters - totalCapacity;
        } else {
            actualCapacity += liters;
            return 0;
        }
    }

    public void removeWater(int liters) {
        actualCapacity -= liters;
    }

    public void fill() {
        actualCapacity = totalCapacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }
}
