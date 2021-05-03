package chapter17;

import java.io.*;
import java.util.Date;


public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException, Exception {
    try ( // Create an output stream for file object.dat
      ObjectOutputStream output =
        new ObjectOutputStream(new FileOutputStream("object.dat"));
    ) {
      // Write a string, double value, and object to the file
      output.writeUTF("Fred");
      output.writeDouble(85.5);
      Date td = new Date();
      System.out.println(td.getSeconds());
      output.writeObject(td);
      System.out.println(td.getSeconds());
    }
  }
}
