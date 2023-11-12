import java.util.*;

public class Cleric {
  String name;
  int HP = 50;
  static final int MAX_HP = 50;
  int MP = 10;
  static final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.HP = this.MAX_MP;
    this.MP -= 5;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
    int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MAX_MP - this.MP, recover);
    this.MP += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}
