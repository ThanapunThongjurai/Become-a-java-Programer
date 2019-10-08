public class A7 {

    public static void main(String[] args) {
        Toothpick toothpick = new Toothpick();

        BattleShip ship = new BattleShip();
        ship.setAge(3);

        CD music = new CD("Do your Remember",2000);

        Cart cart1 = new Cart(3);

        cart1.items[0] = toothpick;
        cart1.items[1] = ship;
        cart1.items[2] = music;

        System.out.println(cart1.sumPrice());
    }
}
