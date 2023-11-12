public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public void heal(Hero h) {
    int basePoint = 10;
    int recoverPoint = (int) (basePoint * this.getWand().getPower());
    h.setHp(h.getHP() + recoverPoint);
    System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getMP() {
    return this.mp;
  }

  public void setMP(int mp) {
    this.mp = mp;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wand getWand() {
    return this.wand;
  }

  public void setWand(Wand wand) {
    this.wand = wand;
  }
}