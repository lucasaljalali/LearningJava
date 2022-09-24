public class Player {

    private int num = 0;
    private int lifes = 0;
    private final int maxLifes = 3;

    public Player(int num) {
        this.num = num;
        this.setLifes(1);
        System.out.printf("Player numebr %d created%n", num);
    }

    public int getLifes() {
        return this.lifes;
    }

    private void setLifes(int lifes) {
        if (lifes > maxLifes) {
            this.lifes = maxLifes;
        } else if (lifes < 0) {
            this.lifes = 0;
        } else {
            this.lifes = lifes;
        }
    }

    public void addLifes() {
        if (this.lifes < maxLifes) {
            this.lifes++;
        }
    }

}