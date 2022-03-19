public class main {
    public static void main(String[] args) {
        Warlock mage1 = new Warlock(100, "Warlock");
        mage1.getBook().setList("Fireball", new Spell("Fireball","Burned", 1, "Elemenal"));
        Target wall = new Target("Wall");
        mage1.getBook().getList("Fireball").launch(wall);
    }
}
