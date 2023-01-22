public class Television {
    private final String brand;
    private final int screenSize;

    private boolean isOn;
    private int currentChannel, currentVolume;

    public Television(String brand, int screenSize) {
        this.brand = brand;

        if (screenSize >= 15 && screenSize <= 90) {
            this.screenSize = screenSize;
        }
        else {
            throw new IllegalArgumentException("Dimensione non valida.");
        }

        isOn = false;
        currentChannel = 1;
        currentVolume = 20;
    }

    public void changeStatus() {
        isOn = !isOn;
    }

    public void volumeUp() {
        if (currentVolume != 50) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

    public void channelUp() {
        if (currentChannel != 200) {
            currentVolume++;
        }
    }

    public void channelDown() {
        if (currentChannel != 0) {
            currentChannel--;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}
