import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    System.out.printf("製造番号%s-%02d", "SJV", 3);

    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");

    Date now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);

    Calendar c = Calendar.getInstance();
    c.set(2019, 8, 22, 1, 23, 45);
    c.set(Calendar.MONTH, 9);
    Date d = c.getTime();
    System.out.println(d);
    Date newNow = new Date();
    c.setTime(newNow);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}