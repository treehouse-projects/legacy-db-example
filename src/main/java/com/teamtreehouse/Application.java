package com.teamtreehouse;

import com.teamtreehouse.db.Connection;
import com.teamtreehouse.db.LegacyDatabase;

import java.io.IOException;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    // ============================================================
    // Imagine this repeated hundreds of times in your code base...
    // ============================================================

    try (LegacyDatabase db = LegacyDatabase.fromConfig();) {
      Connection conn = db.getConnection();
      // Sometimes connection comes back closed, make sure it is opened before using it.
      if (!conn.isOpen()) {
        conn.open();
      }
      List<String> results = conn.execute("SELECT first_name FROM students");
      for (String row : results) {
        System.out.println(row);
      }
    } catch(Exception e) {
      System.err.println("Problem cleaning up database:  " + e);

    }
  }

}
