public class Car {
    private String model;
    private String color;
    private String engine;
    private int seats;
    public Car(String model, String color, String engine, int seats) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.seats = seats;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    @Override
    public String toString() {
        return "Car:" + model + ", color: " + color + ", engine: " + engine + ", seats: " + seats;
    }
}
