package Exercise8;

public class Car {
    private String name;
    private Boolean on;
    private Boolean destroyed;
    private Integer armored;
    private Boolean weapons;

    public Car(String name) {
        this.name = name;
        this.on = false;
        this.destroyed = false;
        this.armored = 0;
        this.weapons = false;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getOn() {
        return this.on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public Boolean getDestroyed() {
        return this.destroyed;
    }

    public void setDestroyed(Boolean destroyed) {
        this.destroyed = destroyed;
    }

    public Integer getArmored() {
        return this.armored;
    }

    public void setArmored(Integer armored) {
        this.armored = armored;
    }

    public Boolean getWeapons() {
        return this.weapons;
    }

    public void setWeapons(Boolean weapons) {
        this.weapons = weapons;
    }

    public void soferDamage(Integer damage) {
        this.armored -= damage;
        if (this.armored <= 0) {
            this.armored = 0;
            this.on = false;
            this.destroyed = true;
        }
    }

    public void info() {
        System.out.println("-------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("On: " + (this.on ? "yes" : "no"));
        System.out.println("Destroyed: " + (this.destroyed ? "yes" : "no"));
        System.out.println("Armored: " + this.armored);
        System.out.println("Weapons: " + (this.weapons ? "yes" : "no"));
    }

}