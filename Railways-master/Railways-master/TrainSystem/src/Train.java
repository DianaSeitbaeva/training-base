import java.util.Iterator;

public class Train {
    cargoCar CargoCar;
    passengerCar PassengerCar;

    public Train(cargoCar, passengerCar) {
        this.CargoCar = CargoCar;
        this.PassengerCar = PassengerCar;

    }
    public void printMenu(){
        Iterator CargoIterator = cargoCar.createIterator();

    }
}
