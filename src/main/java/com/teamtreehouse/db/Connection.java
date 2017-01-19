package com.teamtreehouse.db;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Connection {
  private boolean isOpen;

  public void open() throws IOException {
    if (isOpen) {
      throw new IOException("Already opened");
    }
    System.out.println("Connection::open was called");
    isOpen = true;
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void close() throws IOException {
    if (!isOpen) {
      throw new IOException("Not opened");
    }
    System.out.println("Connection::close was called");
    isOpen = false;
  }

  public List<String> execute(String statement) throws IOException {
    if (!isOpen) {
      throw new IOException("Connection is not opened");
    }
    System.out.printf("Running query: %s %n", statement);
    // #jklol
    return Arrays.asList("Andrew", "Dave", "Chris", "James", "Alena");
  }
}
