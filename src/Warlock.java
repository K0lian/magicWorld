public class Warlock {
    private int hp = 100;
    private int lastDamage=0;
    private String name;
    private SpellBook book;

    public int getLastDamage() {
        return lastDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warlock(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public Warlock() {
    }

    public void dealDamage(int dmg){
        hp -= dmg;
        lastDamage = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public SpellBook getBook() {
        return book;
    }

    public void setBook(SpellBook book) {
        this.book = book;
    }
}
