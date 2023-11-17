import java.util.ArrayList;
import java.util.Iterator;

import java.util.HashSet;
import java.util.Set;

import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

    // ArrayList

    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      System.out.println(i);
    }

    // iterator

    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }

    // HashSet

    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤"); // 重複して「赤」を格納しようとしても無視される
    System.out.println("色は" + colors.size() + "種類");

    for (String s : colors) {
      System.out.println(s + "→");
    }

    // TreeSet

    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.println(s + "→");
    }
  }
}
