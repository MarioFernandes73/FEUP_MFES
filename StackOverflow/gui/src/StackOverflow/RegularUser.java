package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class RegularUser extends RegisteredUser {
  public void cg_init_RegularUser_1(
      final Number id1,
      final String name1,
      final String email1,
      final Number age1,
      final Object sex1,
      final Number reputation1,
      final String username1,
      final String password1) {

    canRate = true;
    canCreatePost = true;
    canEditPost = true;
    canAddComment = true;
    canEditComment = true;
    cg_init_RegisteredUser_1(
        id1, name1, email1, age1, ((Object) sex1), reputation1, username1, password1);
  }

  public RegularUser(
      final Number id1,
      final String name1,
      final String email1,
      final Number age1,
      final Object sex1,
      final Number reputation1,
      final String username1,
      final String password1) {

    cg_init_RegularUser_1(id1, name1, email1, age1, sex1, reputation1, username1, password1);
  }

  public RegularUser() {}

  public String toString() {

    return "RegularUser{}";
  }
}
