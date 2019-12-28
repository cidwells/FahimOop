package polymorphisim;

public class Main {
    public static void main(String[] args) {
        System.out.println( Area.area(3,2));
        System.out.println(Area.area(15));
        System.out.println(Area.area(15,13));
        System.out.println(Area.area(19));
        BasketBallPlayer player = new BasketBallPlayer();
        player.score(60);
    }
}
