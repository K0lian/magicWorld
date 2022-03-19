import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
//        Warlock mage1 = new Warlock(100, "Warlock");
//        mage1.getBook()
//                .setList("Fireball",
//                        new Spell("Fireball","Burned", 1, "Elemenal"));
//        Target wall = new Target("Wall");
//        mage1.getBook().getList("Fireball");
        List<String> myFirstList = new ArrayList<>();
        String second = "2";
        myFirstList.add(second);
        Map<String, List<Spell>> myFirstMap = new HashMap<>();
        List<Spell> mySpellList = new ArrayList<>();
        String first = "1";
        Spell firstSpell = new Spell("First Spell", "firsted", 0, "Archeomancy");
        Spell secondSpell = new Spell("Second Spell", "seconded", 0, "Archeomancy");
        mySpellList.add(firstSpell);
        mySpellList.add(secondSpell);
//        myFirstMap.put(first, firstSpell);
//        myFirstMap.put(first, secondSpell);
        myFirstMap.put(first, mySpellList);
        System.out.println(myFirstMap.get("1"));
        System.out.println(myFirstMap);
    }
}
