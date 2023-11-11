public class SuperHero extends Hero {
  boolean flying;

  public void attack(Matango m) {
    super.attack(m); // super = 今より1つ内側のインスタンス部分
    if (this.flying) {
      super.attack(m);
    }
  }

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void run() { // 親クラスに定義してあっても子クラスに再定義（上書き）できる
    System.out.println(this.name + "は撤退した");
  }
}