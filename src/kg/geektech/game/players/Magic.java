package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, int i, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
