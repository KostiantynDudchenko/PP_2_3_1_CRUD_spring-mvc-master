package web.model;

public class Car {

    private String model;
    private String type;
    private int yearOfBuild;

    public Car() {
    }

    public Car(String model, String type, int yearOfBuild) {
        this.model = model;
        this.type = type;
        this.yearOfBuild = yearOfBuild;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", yearOfBuild=" + yearOfBuild +
                '}';
    }
}
