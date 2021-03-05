import model.AutoMake;
import model.Car;
import model.Color;

import java.util.Arrays;

public class CarArray {

    private static Car car1 = new Car(AutoMake.HYUNDAI, "Accent", 2020, Color.BLACK, "123KLM");
    private static Car car2 = new Car(AutoMake.VOLKSWAGEN, "Polo", 1990, Color.GREY, "345OPM");
    private static Car car3 = new Car(539, AutoMake.LADA, "Kalina", Color.GREEN, 548690);
    private static Car car4 = new Car(6789, AutoMake.TOYOTA, "Camry", Color.BLUE, 839456);
    private static Car car5 = new Car(8965, AutoMake.MERCEDES, "E500", Color.RED, 32345);
    private static Car car6 = new Car(3586, AutoMake.TOYOTA, "Corolla", Color.GREEN, 548690);
    private static Car car7 = new Car(AutoMake.HYUNDAI, "Accent", 2015, Color.YELLOW, "876KGH");

    public Car searchById(Car[] car, int id) {
        Car searchCar = null;
        for (Car x : car) {
            if (x.getId() == id) searchCar = x;
        }
        return searchCar;
    }

    public Car[] searchByMake(Car[] car, AutoMake autoMake) {
        int count = 0;
        int count1 = 0;
        for (Car x : car) {
            if (x.getAutoMake().equals(autoMake)) count++;
        }
        Car[] searchCars = new Car[count];
        for (Car x : car) {
            if (x.getAutoMake().equals(autoMake)) {
                searchCars[count1] = x;
                count1++;
            }
        }
        return searchCars;
    }

    public Car[] searchByModel(Car[] car, String model) {
        int count = 0;
        int count1 = 0;
        for (Car x : car) {
            if (x.getModel().equals(model)) count++;
        }
        Car[] searchCars = new Car[count];
        for (Car x : car) {
            if (x.getModel().equals(model)) {
                searchCars[count1] = x;
                count1++;
            }
        }
        return searchCars;
    }

    public Car[] searchByFirstReg(Car[] car, int firstReg) {
        int count = 0;
        int count1 = 0;
        for (Car x : car) {
            if (x.getFirstRegistration() == firstReg) count++;
        }
        Car[] searchCars = new Car[count];
        for (Car x : car) {
            if (x.getFirstRegistration() == firstReg) {
                searchCars[count1] = x;
                count1++;
            }
        }
        return searchCars;
    }

    public Car[] searchByColor(Car[] car, Color color) {
        int count = 0;
        int count1 = 0;
        for (Car x : car) {
            if (x.getColor().equals(color)) count++;
        }
        Car[] searchCars = new Car[count];
        for (Car x : car) {
            if (x.getColor().equals(color)) {
                searchCars[count1] = x;
                count1++;
            }
        }
        return searchCars;
    }

    public Car[] searchByPrice(Car[] car, int price) {
        int count = 0;
        int count1 = 0;
        for (Car x : car) {
            if (x.getPrice() == price) count++;
        }
        Car[] searchCars = new Car[count];
        for (Car x : car) {
            if (x.getPrice() == price) {
                searchCars[count1] = x;
                count1++;
            }
        }
        return searchCars;
    }

    public Car searchByRegistration(Car[] car, String registration) {
        Car searchCar = null;
        for (Car x : car) {
            try {
                if (x.getRegistration().equals(registration)) searchCar = x;
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
        return searchCar;
    }

    public static void main(String[] args) {
        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};
        CarArray carArray = new CarArray();

        switch (args[0]) {
            case "id":
                System.out.println(carArray.searchById(cars, Integer.parseInt(args[1])));
                break;
            case "make":
                System.out.println(Arrays.toString(carArray.searchByMake(cars, AutoMake.valueOf(args[1]))));
                break;
            case "model":
                System.out.println(Arrays.toString(carArray.searchByModel(cars, args[1])));
                break;
            case "firstReg":
                System.out.println(Arrays.toString(carArray.searchByFirstReg(cars, Integer.parseInt(args[1]))));
                break;
            case "color":
                System.out.println(Arrays.toString(carArray.searchByColor(cars, Color.valueOf(args[1]))));
                break;
            case "price":
                System.out.println(Arrays.toString(carArray.searchByPrice(cars, Integer.parseInt(args[1]))));
                break;
            case "registration":
                System.out.println(carArray.searchByRegistration(cars, args[1]));
                break;
            default:
                System.out.println("parameter not found!");
        }
    }
}
