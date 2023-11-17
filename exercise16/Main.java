import java.util.*;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");

    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }

    Map<Hero, Integer> braves = new HashMap<Hero, Integer>();
    braves.put(h1, 3);
    braves.put(h2, 7);
    for (Hero key : braves.keySet()) {
      int value = braves.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }
}