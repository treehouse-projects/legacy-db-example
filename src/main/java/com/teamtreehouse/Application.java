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

    LegacyDatabase.withConnection(conn -> {
      List<String> results  = conn.execute("SELECT first_name FROM students");
      results.forEach(System.out::println);
    });

  }

}
