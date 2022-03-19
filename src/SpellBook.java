import java.util.HashMap;
import java.util.Map;

public class SpellBook {
    private Map<String, Spell> list;

    public String getList(String str) {
        return str;
    }
//
////    static Map<String, Spell> staticMap = new HashMap<>();
//
//    public SpellBook(Map<String, Spell> list) {
//        this.list = list;
//    }
//
//    public SpellBook() {
//        this.list = ;
//    }

//    public SpellBook(Spell spl) {
//        list.put("First Spell", spl);
//    }

    public void setList(Map<String, Spell> list) {
        this.list = list;
    }

    public void setList(String str, Spell spell) {
        this.list.put(str, spell);
    }
}
