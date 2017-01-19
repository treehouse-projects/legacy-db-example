package com.teamtreehouse.db;

import java.io.IOException;

@FunctionalInterface
public interface ConnectionConsumer {

  public void accept(Connection conn) throws IOException;

}
