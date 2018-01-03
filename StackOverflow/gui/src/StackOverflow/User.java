package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;
import StackOverflow.quotes.*;

@SuppressWarnings("all")
public class User {
  protected Boolean canRate;
  protected Boolean canCreatePost;
  protected Boolean canEditPost;
  protected Boolean canRemovePost;
  protected Boolean canAddComment;
  protected Boolean canEditComment;
  protected Boolean canRemoveComment;
  protected Boolean canBanUsers;
  protected Boolean canUnbanUsers;
  protected Object banned;

  public void cg_init_User_1() {

    canRate = false;
    canCreatePost = false;
    canEditPost = false;
    canRemovePost = false;
    canAddComment = false;
    canEditComment = false;
    canRemoveComment = false;
    canBanUsers = false;
    canUnbanUsers = false;
    banned = UnbannedQuote.getInstance();
  }

  public User() {

    cg_init_User_1();
  }

  public Boolean getCanRate() {

    return canRate;
  }

  public Boolean getCanCreatePost() {

    return canCreatePost;
  }

  public Boolean getCanEditPost() {

    return canEditPost;
  }

  public Boolean getCanRemovePost() {

    return canRemovePost;
  }

  public Boolean getCanAddComment() {

    return canAddComment;
  }

  public Boolean getCanEditComment() {

    return canEditComment;
  }

  public Boolean getCanRemoveComment() {

    return canRemoveComment;
  }

  public Boolean getCanBanUsers() {

    return canBanUsers;
  }

  public Boolean getCanUnbanUsers() {

    return canUnbanUsers;
  }

  public Object getBanState() {

    return banned;
  }

  public void setBanState(final Object newBanState) {

    banned = newBanState;
  }

  public String getEmail() {

    return "";
  }

  public Object getSex() {

    return MasculinoQuote.getInstance();
  }

  public String getName() {

    return "";
  }

  public Number getAge() {

    return 1L;
  }

  public String getUsername() {

    return "";
  }

  public String getPassword() {

    return "";
  }

  public User editUser(
      final String name1, final String email1, final Number age1, final Object sex1) {

    return this;
  }

  public String toString() {

    return "User{"
        + "canRate := "
        + Utils.toString(canRate)
        + ", canCreatePost := "
        + Utils.toString(canCreatePost)
        + ", canEditPost := "
        + Utils.toString(canEditPost)
        + ", canRemovePost := "
        + Utils.toString(canRemovePost)
        + ", canAddComment := "
        + Utils.toString(canAddComment)
        + ", canEditComment := "
        + Utils.toString(canEditComment)
        + ", canRemoveComment := "
        + Utils.toString(canRemoveComment)
        + ", canBanUsers := "
        + Utils.toString(canBanUsers)
        + ", canUnbanUsers := "
        + Utils.toString(canUnbanUsers)
        + ", banned := "
        + Utils.toString(banned)
        + "}";
  }
}
