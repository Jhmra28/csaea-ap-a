public class Robot (

    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    public Robot(String name, String serial, double battery) (
        this.name = name;
        this.serial = serial;
        this.battery = battery;
        this.isOn = false;
    )

    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }

    public void randomDrain() {
        double drain = Math.random() * 10;
        battery = Math.max(0, battery - drain);
    }

    public boolean isOn() {
        return isOn;
    }

    // setters / mutators, always void

    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return name = " [" + serial + "]";
    }




)