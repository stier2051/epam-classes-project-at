package model;

public class Car {
    private int id;
    private String make; /* марка */
    private String model; /* модель */
    private int firstRegistration; /* год выпуска */
    private String color; /* цвет */
    private int price; /* цена */
    private String registration; /* регистрационный номер */

    public Car(String make, String model, int firstRegistration, String color, String registration) {
        this.make = make;
        this.model = model;
        this.firstRegistration = firstRegistration;
        this.color = color;
        this.registration = registration;
    }

    public Car(int id, String make, String model, int price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car make: " + make +
                ", model: " + model +
                ", price: " + price +
                ", first registration: " + firstRegistration;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFirstRegistration() {
        return firstRegistration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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