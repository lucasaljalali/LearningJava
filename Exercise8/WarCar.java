package Exercise8;

public class WarCar extends Car {

    private final int MAX_WEAPONS = 100;
    private final int MIN_WEAPONS = 0;
    private int numberOfWeapons;

    public WarCar(String name, int armored) {
        super(name);
        setWeapons(true);
        setArmored(armored);
        this.numberOfWeapons = 100;
    }

    public void setNumberOfWeapons(int numberOfWeapons) {
        this.numberOfWeapons = numberOfWeapons;
        if (this.numberOfWeapons > MAX_WEAPONS) {
            this.numberOfWeapons = MAX_WEAPONS;
        }
        if (this.numberOfWeapons < MIN_WEAPONS) {
            this.numberOfWeapons = MIN_WEAPONS;
        }
    }

    public int getNumberOfWeapons() {
        return this.numberOfWeapons;
    }

    public void shoot() {
        if (this.numberOfWeapons > MIN_WEAPONS) {
            setNumberOfWeapons(-1);
        } else {
            System.out.println("No weapons available");
        }
    }

    public void info() {
        super.info();
        System.out.println("Number of weapons: " + this.numberOfWeapons);
    }

}
