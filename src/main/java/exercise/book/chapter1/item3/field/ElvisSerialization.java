package exercise.book.chapter1.item3.field;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ElvisSerialization {

  public static void main(String[] args) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
      out.writeObject(Elvis.getInstance());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
