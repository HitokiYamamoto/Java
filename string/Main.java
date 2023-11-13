public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava!";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) { // equals = 内容が等しいか調べる
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) { // equalsIgnoreCase = 大文字、小文字を区別せず内容が等しいか調べる
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です"); // length = 文字列長を調べる
    if (s1.isEmpty()) { // isEmpty = 空文字か(長さが0か)を調べる
      System.out.println("s1は空文字です");
    }
  }
}