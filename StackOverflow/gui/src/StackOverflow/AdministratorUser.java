package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;
import StackOverflow.quotes.*;

@SuppressWarnings("all")
public class AdministratorUser extends RegisteredUser {
  public void cg_init_AdministratorUser_1(
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
    canRemovePost = true;
    canAddComment = true;
    canEditComment = true;
    canRemoveComment = true;
    canBanUsers = true;
    canUnbanUsers = true;
    cg_init_RegisteredUser_1(
        id1, name1, email1, age1, ((Object) sex1), reputation1, username1, password1);
  }

  public AdministratorUser(
      final Number id1,
      final String name1,
      final String email1,
      final Number age1,
      final Object sex1,
      final Number reputation1,
      final String username1,
      final String password1) {

    cg_init_AdministratorUser_1(id1, name1, email1, age1, sex1, reputation1, username1, password1);
  }

  public void banUser(final User user) {

    user.setBanState(BannedQuote.getInstance());
  }

  public void unbanUser(final User user) {

    user.setBanState(UnbannedQuote.getInstance());
  }

  public AdministratorUser() {}

  public String toString() {

    return "AdministratorUser{}";
  }
}
