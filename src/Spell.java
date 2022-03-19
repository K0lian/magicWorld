public class Spell {
    private String name;
    private String effect;
    private int level;
    private String school;
    private int damage;

    public int getLevel() {
        return level;
    }

    public Spell(String name, String effect, int level, String school) {
        this.name = name;
        this.effect = effect;
        this.level = level;
        this.school = school;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void launch(){
        System.out.println(name + " has been casted\n");
    }

    public void launch(Target trg){
        System.out.println(name + " has been casted on "+ trg.getName() +"\n" +
                trg.getName() + " has been " + effect);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
