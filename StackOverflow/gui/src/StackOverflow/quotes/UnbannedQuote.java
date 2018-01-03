package StackOverflow.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class UnbannedQuote {
  private static int hc = 0;
  private static UnbannedQuote instance = null;

  public UnbannedQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static UnbannedQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new UnbannedQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof UnbannedQuote;
  }

  public String toString() {

    return "<Unbanned>";
  }
}
