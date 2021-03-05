package model;

public class Car {
    private int id;
    private AutoMake autoMake; /* марка */
    private String model; /* модель */
    private int firstRegistration; /* год выпуска */
    private Color color; /* цвет */
    private int price; /* цена */
    private String registration; /* регистрационный номер */

    public Car(AutoMake autoMake, String model, int firstRegistration, Color color, String registration) {
        this.autoMake = autoMake;
        this.model = model;
        this.firstRegistration = firstRegistration;
        this.color = color;
        this.registration = registration;
    }

    public Car(int id, AutoMake autoMake, String model, Color color, int price) {
        this.id = id;
        this.autoMake = autoMake;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car make: " + autoMake +
                ", model: " + model +
                ", color: " + color;
    }

    public int getId() {
        return id;
    }

    public AutoMake getAutoMake() { return autoMake; }

    public void setAutoMake(AutoMake autoMake) { this.autoMake = autoMake; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFirstRegistration() {
        return firstRegistration;
    }

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistration() {
        return registration;
    }
}