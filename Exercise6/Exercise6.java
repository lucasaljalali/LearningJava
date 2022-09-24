public class Exercise6 {

    public static void main(String[] args) {

        int num = 0;

        Player p1 = new Player(++num);
        Player p2 = new Player(++num);
        Player p3 = new Player(++num);

        p1.addLifes();
        p1.addLifes();
        System.out.printf("%nLifes of player 1:%d", p1.getLifes());
        System.out.printf("%nLifes of player 2:%d", p2.getLifes());
        System.out.printf("%nLifes of player 3:%d", p3.getLifes());

    }

}
