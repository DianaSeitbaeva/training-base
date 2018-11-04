package railway;

public enum TypeOfCargoCar {
    BOXCAR(60), // полувагон
    HOPPER(60), // хоппер
    TANK(60), //цистерна
    FlAT(60), // вагон - платформа
    REFRIGERATER(60), // рефрежиратор
    COVERED(60); //крытый вагон

    private static final int WEIGHT_OF_CARGO_CAR = 60;


    private TypeOfCargoCar(int WEIGHT_OF_CARGO_CAR){
        this.WEIGHT_OF_CARGO_CAR = WEIGHT_OF_CARGO_CAR;
    }



}
