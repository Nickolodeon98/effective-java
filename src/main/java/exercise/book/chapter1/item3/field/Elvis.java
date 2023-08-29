package exercise.book.chapter1.item3.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable, Singer {

  /**
   * 싱글톤 오브젝트
   */
  /* API 를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다. */
  private static final Elvis INSTANCE = new Elvis();
  private static boolean created;
  public static Elvis getInstance() { return INSTANCE; }
  private Elvis() {
    if (created)
      throw new UnsupportedOperationException("can't be created by constructor.");
    created = true;
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Christmas without you~");
  }

  public static void main(String[] args) {
    Elvis elvis = Elvis.getInstance();
    elvis.leaveTheBuilding();
  }

  Object readResolve() {
    return INSTANCE;
  }
}
