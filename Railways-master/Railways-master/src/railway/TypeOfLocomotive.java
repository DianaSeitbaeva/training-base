package railway;

public enum TypeOfLocomotive {
    ELECTRIC(6000),
    DIESEL(4500);

    private int powerCapacity;


    private TypeOfLocomotive(int powerCapacity){
        this.powerCapacity = powerCapacity;
    }

    public void setPowerCapacity(int powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

}
