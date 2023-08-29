package exercise.book.chapter1.item3.enumtype;

import exercise.book.chapter1.item3.field.IElvis;

/* 테스트 시 상속을 통해 인터페이스를 사용하면 된다. */
public enum Elvis implements IElvis {
  INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("기다려 자기야, 지금 나갈께!");
  }

  @Override
  public void sing() {

  }

  public static void main(String[] args) {
    Elvis elvis = Elvis.INSTANCE;
    elvis.leaveTheBuilding();
  }
}
