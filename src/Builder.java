public class Builder{
    private String model;
    private String engine;
    private String color;
    private int seats;
    public Builder withModel(String model) {
        this.model = model;
        return this;
    }
    public Builder withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public Builder withColor(String color) {
        this.color = color;
        return this;
    }
    public Builder withSeats(int seats) {
        this.seats = seats;
        return this;
    }
    public Car build() {
        return new Car(model, engine, color, seats);
    }
}
