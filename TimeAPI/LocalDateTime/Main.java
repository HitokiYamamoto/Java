import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();

    // 各種日時クラスのメソッド

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);

    LocalDate now = LocalDate.now();
    if (now.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }

    // Periodクラス

    LocalDate d1 = LocalDate.of(2020, 1, 1);
    LocalDate d2 = LocalDate.of(2020, 1, 4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1, d2);

    LocalDate d3 = d2.plus(p2);
  }
}