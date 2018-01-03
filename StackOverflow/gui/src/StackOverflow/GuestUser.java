package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class GuestUser extends User {
  public void cg_init_GuestUser_1() {

    cg_init_User_1();
  }

  public GuestUser() {

    cg_init_GuestUser_1();
  }

  public String toString() {

    return "GuestUser{}";
  }
}
