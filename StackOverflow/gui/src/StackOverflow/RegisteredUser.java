package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class RegisteredUser extends User {
  protected Number id;
  protected String name;
  protected Number age;
  protected String email;
  protected Object sex;
  protected Number reputation;
  protected VDMSet posts = SetUtil.set();
  protected VDMSet comments = SetUtil.set();
  protected String username;
  protected String password;

  public void cg_init_RegisteredUser_1(
      final Number id1,
      final String name1,
      final String email1,
      final Number age1,
      final Object sex1,
      final Number reputation1,
      final String username1,
      final String password1) {

    id = id1;
    name = name1;
    email = email1;
    age = age1;
    sex = sex1;
    reputation = reputation1;
    username = username1;
    password = password1;
    return;
  }

  public RegisteredUser(
      final Number id1,
      final String name1,
      final String email1,
      final Number age1,
      final Object sex1,
      final Number reputation1,
      final String username1,
      final String password1) {

    cg_init_RegisteredUser_1(id1, name1, email1, age1, sex1, reputation1, username1, password1);
  }

  public RegisteredUser editUser(
      final String name1, final String email1, final Number age1, final Object sex1) {

    name = name1;
    email = email1;
    age = age1;
    sex = sex1;
    return this;
  }

  public void addReputation(final Number value) {

    reputation = reputation.longValue() + value.longValue();
  }

  public void addPost(final Post question) {

    posts = SetUtil.union(Utils.copy(posts), SetUtil.set(question));
  }

  public void addComment(final Comment comment) {

    comments = SetUtil.union(Utils.copy(comments), SetUtil.set(comment));
  }

  public void deleteComment(final Comment comment) {

    comments = SetUtil.diff(Utils.copy(comments), SetUtil.set(comment));
  }

  public Post createPost(
      final String title,
      final String content,
      final VDMSet tagsList,
      final Number day,
      final Number month,
      final Number year) {

    Post newPost = new Post(title, content, this, Utils.copy(tagsList), day, month, year);
    addPost(newPost);
    return newPost;
  }

  public Post editPost(
      final Post question, final String title, final String content, final VDMSet tagsList) {

    return question.editPost(title, content, Utils.copy(tagsList));
  }

  public void removePost(final Post question) {

    posts = SetUtil.diff(Utils.copy(posts), SetUtil.set(question));
  }

  public Comment createComment(
      final Post question,
      final String content,
      final Number day,
      final Number month,
      final Number year) {

    Comment newComment = new Comment(content, this, day, month, year);
    question.addComment(newComment);
    addComment(newComment);
    return newComment;
  }

  public Comment editComment(final Comment comment, final String content) {

    return comment.editComment(content);
  }

  public void removeComment(final Post question, final Comment comment) {

    question.removeComment(comment);
    deleteComment(comment);
  }

  public Number getId() {

    return id;
  }

  public String getName() {

    return name;
  }

  public Number getAge() {

    return age;
  }

  public String getEmail() {

    return email;
  }

  public Object getSex() {

    return sex;
  }

  public Number getReputation() {

    return reputation;
  }

  public VDMSet getPosts() {

    return Utils.copy(posts);
  }

  public VDMSet getComments() {

    return Utils.copy(comments);
  }

  public String getUsername() {

    return username;
  }

  public String getPassword() {

    return password;
  }

  public RegisteredUser() {}

  public String toString() {

    return "RegisteredUser{"
        + "id := "
        + Utils.toString(id)
        + ", name := "
        + Utils.toString(name)
        + ", age := "
        + Utils.toString(age)
        + ", email := "
        + Utils.toString(email)
        + ", sex := "
        + Utils.toString(sex)
        + ", reputation := "
        + Utils.toString(reputation)
        + ", posts := "
        + Utils.toString(posts)
        + ", comments := "
        + Utils.toString(comments)
        + ", username := "
        + Utils.toString(username)
        + ", password := "
        + Utils.toString(password)
        + "}";
  }
}
