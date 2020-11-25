public class Car {

    private int windows;
    private int tyrs;
    private int milage;
    private int horsepower;
    private boolean tankSize;
    private boolean brand;
    private int years;
    private String manufacture;
    private String paint;
    private String condition;

    public Car() {

    }

    public Car(int windows) {
        this.windows = windows;
    }

    public Car(int windows, int tyrs, int milage, int horsepower, boolean tankSize, boolean brand, int years, String manufacture, String paint, String condition) {
        this.windows = windows;
        this.tyrs = tyrs;
        this.milage = milage;
        this.horsepower = horsepower;
        this.tankSize = tankSize;
        this.brand = brand;
        this.years = years;
        this.manufacture = manufacture;
        this.paint = paint;
        this.condition = condition;
    }

    // some cars don't yet have a condition but want it on the system
    public Car(int windows, int tyrs, int milage, int horsepower, boolean tankSize, boolean brand, int years, String manufacture, String paint) {
        this.windows = windows;
        this.tyrs = tyrs;
        this.milage = milage;
        this.horsepower = horsepower;
        this.tankSize = tankSize;
        this.brand = brand;
        this.years = years;
        this.manufacture = manufacture;
        this.paint = paint;
    }


    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getTyrs() {
        return tyrs;
    }

    public void setTyrs(int tyrs) {
        this.tyrs = tyrs;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isTankSize() {
        return tankSize;
    }

    public void setTankSize(boolean tankSize) {
        this.tankSize = tankSize;
    }

    public boolean isBrand() {
        return brand;
    }

    public void setBrand(boolean brand) {
        this.brand = brand;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
