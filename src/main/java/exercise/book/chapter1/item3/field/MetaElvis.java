package exercise.book.chapter1.item3.field;

/* 정적 팩터리를 제네릭 싱글턴 팩터리로 만들 수 있다. */
public class MetaElvis<T> {

  private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

  private MetaElvis() {}

  @SuppressWarnings("unchecked")
  public static <E> MetaElvis<E> getInstance() { return (MetaElvis<E>) INSTANCE; }

  public void say(T t) {
    System.out.println(t);
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }

  public static void main(String[] args) {
    MetaElvis<String> elvis1 = MetaElvis.getInstance();
    MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    System.out.println(elvis1);
    System.out.println(elvis2);
    elvis1.say("hello");
    elvis2.say(100);
  }
}
