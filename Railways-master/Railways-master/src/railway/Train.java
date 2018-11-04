package railway;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    private  int trainLegth = 0;
    private boolean longDistance;
    private List<Car> cars;
//    private static final int STATION_LENGTH = 1250; // Ограничение Длина станционных путей
//    private static final int PASSENGER_CAR_LENGTH = 25; // Округленно длина пассажиских вагонов (одинаковая для всех)

    public static void main(String[] args) {
        System.out.println("Please select a type of the locomotive: (E) - Electric, (D) - Diesel");
        Scanner sl = new Scanner(System.in);
        String txt = sl.nextLine();
        switch(txt){
            case "E":
                Locomotive  locomotive = new Locomotive(TypeOfLocomotive.ELECTRIC);
                break;
            case "D":
                Locomotive locomotivel = new Locomotive(TypeOfLocomotive.DIESEL);
                break;

                default:
                    System.out.println("Invalid choose.");

        }
    }
     public static Locomotive selectLocomotive() {

    }










//    public Train (boolean longDistance){
//        this.longDistance = longDistance;
//        cars = new ArrayList<>();
//    }
//    ArrayList<Train> all = new ArrayList<Train>;
//    Locomotive locomotive = new Locomotive();
//
//
//
//
//
//    public void trainCombine(){
//        if(longDistance){
//            PassengerCar restaurantCar = new PassengerCar(TypeOfPassengerCar.RESTAURANT);
//            cars.add(restaurantCar);
//            trainLegth += PASSENGER_CAR_LENGTH;
//
//            PassengerCar mailCar = new PassengerCar(TypeOfPassengerCar.MAIL);
//            cars.add(mailCar);
//            trainLegth += PASSENGER_CAR_LENGTH;
//        }


    }





}
