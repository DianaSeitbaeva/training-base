package railway;

public class CargoCar extends Car {
    private boolean dangerous;
    private TypeOfCargoCar typeOfCargoCar;


    public CargoCar(boolean dangerous, TypeOfCargoCar typeOfCargoCar) {
        this.dangerous = dangerous;
        this.typeOfCargoCar = typeOfCargoCar;
    }
}
