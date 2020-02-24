package ua.testing;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Main7 {

  public static void main(String[] args) throws FileNotFoundException, EOFException {
    if (System.currentTimeMillis() % 2 == 0) {
      throw new EOFException();
    } else {
      throw new FileNotFoundException();
    }
  }
}

