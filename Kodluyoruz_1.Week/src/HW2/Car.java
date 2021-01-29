package HW2;

public class Car {

    private String color;
    private String model;
    private int modelYear;
    private String fueltype;
    private int km;


    public Car() {
        System.out.println("Properties of Car:");
    }

    public Car(String color, String model, int modelYear, String fueltype, int km) {
        this.color = color;
        this.model = model;
        this.modelYear = modelYear;
        this.fueltype = fueltype;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", fueltype='" + fueltype + '\'' +
                ", km=" + km +
                '}';
    }
}
