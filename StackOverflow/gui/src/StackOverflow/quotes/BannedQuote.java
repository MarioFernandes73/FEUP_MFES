package StackOverflow.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BannedQuote {
  private static int hc = 0;
  private static BannedQuote instance = null;

  public BannedQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static BannedQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new BannedQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof BannedQuote;
  }

  public String toString() {

    return "<Banned>";
  }
}
