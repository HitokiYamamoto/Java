public class Main {
  public static void main(String[] args) {
    System.out.printf("製造番号%s-%02d", "SJV", 3);

    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
  }
}