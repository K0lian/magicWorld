import java.util.Map;

public class SpellBook {
    private Map<String, Spell> list;

    public Spell getList(String str) {
        return list.get(str);
    }

    public SpellBook(Spell spl) {
        list.put("First Spell", spl);
    }

    public SpellBook() {
        this.list = new Map;
    }

    public void setList(Map<String, Spell> list) {
        this.list = list;
    }

    public void setList(String str, Spell spell) {
        this.list.put(str, spell);
    }
}
