package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class StackOverflow {
  private Number userIdCounter = 1L;
  private VDMSet users;
  private VDMSet postsList;
  private User currentUser;

  public void cg_init_StackOverflow_1() {

    currentUser = new GuestUser();
    users = SetUtil.set();
    postsList = SetUtil.set();
    return;
  }

  public StackOverflow() {

    cg_init_StackOverflow_1();
  }

  public RegularUser createRegularUser(
      final String name,
      final String email,
      final Number age,
      final Object sex,
      final Number reputation,
      final String username,
      final String password) {

    return new RegularUser(
        userIdCounter, name, email, age, ((Object) sex), reputation, username, password);
  }

  public AdministratorUser createAdministratorUser(
      final String name,
      final String email,
      final Number age,
      final Object sex,
      final Number reputation,
      final String username,
      final String password) {

    return new AdministratorUser(
        userIdCounter, name, email, age, ((Object) sex), reputation, username, password);
  }

  public void addUser(final User user) {

    users = SetUtil.union(SetUtil.set(user), Utils.copy(users));
    userIdCounter = userIdCounter.longValue() + 1L;
  }

  public void editUser(final String name, final String email, final Number age, final Object sex) {

    currentUser = currentUser.editUser(name, email, age, ((Object) sex));
  }

  public Post createPost(
      final String title,
      final String content,
      final RegisteredUser author,
      final VDMSet tagsList,
      final Number day,
      final Number month,
      final Number year) {

    Post newPost = author.createPost(title, content, Utils.copy(tagsList), day, month, year);
    addPost(newPost);
    return newPost;
  }

  public Post editPost(
      final Post question, final String newTitle, final String newContent, final VDMSet newTags) {

    RegisteredUser author = question.getAuthor();
    return author.editPost(question, newTitle, newContent, Utils.copy(newTags));
  }

  public void deletePost(final Post question) {

    RegisteredUser author = question.getAuthor();
    author.removePost(question);
    removePost(question);
  }

  public Comment addComment(
      final Post question,
      final String content,
      final RegisteredUser author,
      final Number day,
      final Number month,
      final Number year) {

    return author.createComment(question, content, day, month, year);
  }

  public Comment editComment(final Comment comment, final String newContent) {

    RegisteredUser author = comment.getAuthor();
    return author.editComment(comment, newContent);
  }

  public void deleteComment(final Post question, final Comment comment) {

    RegisteredUser author = comment.getAuthor();
    author.removeComment(question, comment);
  }

  public void addPost(final Post question) {

    postsList = SetUtil.union(Utils.copy(postsList), SetUtil.set(question));
  }

  public void removePost(final Post question) {

    postsList = SetUtil.diff(Utils.copy(postsList), SetUtil.set(question));
  }

  public VDMSet getUsers() {

    return Utils.copy(users);
  }

  public VDMSet getPosts() {

    return Utils.copy(postsList);
  }

  public User getCurrentUser() {

    return currentUser;
  }

  public VDMSet searchUsersByName(final String inputName) {

    VDMSet usersTemp = SetUtil.set();
    for (Iterator iterator_1 = users.iterator(); iterator_1.hasNext(); ) {
      User currUser = (User) iterator_1.next();
      if (Utils.equals(currUser.getName(), inputName)) {
        usersTemp = SetUtil.union(SetUtil.set(currUser), Utils.copy(usersTemp));
      }
    }
    return Utils.copy(usersTemp);
  }

  public VDMSet searchUsersByAge(final Number inputName) {

    VDMSet usersTemp = SetUtil.set();
    for (Iterator iterator_2 = users.iterator(); iterator_2.hasNext(); ) {
      User currUser = (User) iterator_2.next();
      if (Utils.equals(currUser.getAge(), inputName)) {
        usersTemp = SetUtil.union(SetUtil.set(currUser), Utils.copy(usersTemp));
      }
    }
    return Utils.copy(usersTemp);
  }

  public VDMSet searchPostsByTitle(final String inputTitle) {

    VDMSet postsTemp = SetUtil.set();
    Number inputSize = inputTitle.length();
    Number counter = 1L;
    Number counter2 = 1L;
    Boolean flagFound = false;
    for (Iterator iterator_3 = postsList.iterator(); iterator_3.hasNext(); ) {
      Post currPost = (Post) iterator_3.next();
      flagFound = false;
      counter2 = 1L;
      Boolean whileCond_1 = true;
      while (whileCond_1) {
        whileCond_1 = counter.longValue() < currPost.getTitle().length();
        if (!(whileCond_1)) {
          break;
        }

        {
          Boolean andResult_83 = false;

          if (Utils.equals(
              currPost.getTitle().charAt(Utils.index(counter)),
              inputTitle.charAt(Utils.index(counter2)))) {
            if (Utils.equals(flagFound, false)) {
              andResult_83 = true;
            }
          }

          if (andResult_83) {
            if (Utils.equals(counter2, inputSize)) {
              postsTemp = SetUtil.union(Utils.copy(postsTemp), SetUtil.set(currPost));
              flagFound = true;

            } else {
              counter2 = counter2.longValue() + 1L;
            }

          } else {
            counter2 = 1L;
          }

          counter = counter.longValue() + 1L;
        }
      }
    }
    return Utils.copy(postsTemp);
  }

  public VDMSet searchPostsByTags(final String inputTag) {

    VDMSet postsTemp = SetUtil.set();
    for (Iterator iterator_4 = postsList.iterator(); iterator_4.hasNext(); ) {
      Post currPost = (Post) iterator_4.next();
      {
        final VDMSet tagList = currPost.getTagsList();
        {
          if (SetUtil.inSet(inputTag, tagList)) {
            postsTemp = SetUtil.union(Utils.copy(postsTemp), SetUtil.set(currPost));
          }
        }
      }
    }
    return Utils.copy(postsTemp);
  }

  public Boolean tryLogin(final String inputUsername, final String inputPassword) {

    for (Iterator iterator_5 = users.iterator(); iterator_5.hasNext(); ) {
      User currUser = (User) iterator_5.next();
      Boolean andResult_85 = false;

      if (Utils.equals(currUser.getUsername(), inputUsername)) {
        if (Utils.equals(currUser.getPassword(), inputPassword)) {
          andResult_85 = true;
        }
      }

      if (andResult_85) {
        currentUser = currUser;
        return true;
      }
    }
    return false;
  }

  public VDMSet orderPostsByDate(final VDMSet posts) {

    VDMSet tempPosts = SetUtil.set();
    Date currentDate = null;
    Date tempDate = null;
    Post tempPost = null;
    for (Iterator iterator_6 = posts.iterator(); iterator_6.hasNext(); ) {
      Post currPost = (Post) iterator_6.next();
      currentDate = currPost.getDate();
      tempDate = currentDate;
      tempPost = currPost;
      for (Iterator iterator_7 = posts.iterator(); iterator_7.hasNext(); ) {
        Post currPost2 = (Post) iterator_7.next();
        if (!(SetUtil.inSet(currPost2, tempPosts))) {
          Boolean andResult_86 = false;

          if (Date.compareDates(currPost2.getDate(), currentDate)) {
            if (Date.compareDates(currPost2.getDate(), tempDate)) {
              andResult_86 = true;
            }
          }

          if (andResult_86) {
            tempPost = currPost2;
            tempDate = currPost2.getDate();
          }
        }

        tempPosts = SetUtil.union(Utils.copy(tempPosts), SetUtil.set(tempPost));
      }
    }
    return Utils.copy(tempPosts);
  }

  public VDMSet orderPostsByRating(final VDMSet posts) {

    VDMSet tempPosts = SetUtil.set();
    Number currentRating = 0L;
    Number tempRating = 0L;
    Post tempPost = null;
    for (Iterator iterator_8 = posts.iterator(); iterator_8.hasNext(); ) {
      Post currPost = (Post) iterator_8.next();
      currentRating = currPost.getRating();
      tempRating = currentRating;
      tempPost = currPost;
      for (Iterator iterator_9 = posts.iterator(); iterator_9.hasNext(); ) {
        Post currPost2 = (Post) iterator_9.next();
        if (!(SetUtil.inSet(currPost2, tempPosts))) {
          Boolean andResult_87 = false;

          if (currPost2.getRating().longValue() > currentRating.longValue()) {
            if (currPost2.getRating().longValue() > tempRating.longValue()) {
              andResult_87 = true;
            }
          }

          if (andResult_87) {
            tempPost = currPost2;
            tempRating = currPost2.getRating();
          }
        }

        tempPosts = SetUtil.union(Utils.copy(tempPosts), SetUtil.set(tempPost));
      }
    }
    return Utils.copy(tempPosts);
  }

  public String toString() {

    return "StackOverflow{"
        + "userIdCounter := "
        + Utils.toString(userIdCounter)
        + ", users := "
        + Utils.toString(users)
        + ", postsList := "
        + Utils.toString(postsList)
        + ", currentUser := "
        + Utils.toString(currentUser)
        + "}";
  }
}
