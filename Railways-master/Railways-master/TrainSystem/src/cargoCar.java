import java.util.ArrayList;

public class cargoCar {
    ArrayList Car;
    public cargoCar(){
        Car = new ArrayList();

        addItem("BoxCar", 60);
        addItem("Hopper", 60);
        addItem("Tank", 60);
        addItem("Flat", 60);
        addItem("Refrigerator", 60);
        addItem("Covered", 60);
    }
    public void addItem(String name, int weight){
        Car car = new Car(name, weight);
        Car.add(Car);
    }
    public ArrayList getCar(){
        return Car;
    }
}
