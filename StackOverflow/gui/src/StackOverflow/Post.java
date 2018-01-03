package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Post {
  private String title;
  private String content;
  private RegisteredUser author;
  private Date date;
  private Number views = 0L;
  private Number rating = 0L;
  private VDMSet tagsList;
  private VDMSet commentsList = SetUtil.set();

  public void cg_init_Post_1(
      final String postTitle,
      final String postContent,
      final RegisteredUser postAuthor,
      final VDMSet postTags,
      final Number day,
      final Number month,
      final Number year) {

    title = postTitle;
    content = postContent;
    author = postAuthor;
    tagsList = Utils.copy(postTags);
    date = new Date(year, month, day);
    return;
  }

  public Post(
      final String postTitle,
      final String postContent,
      final RegisteredUser postAuthor,
      final VDMSet postTags,
      final Number day,
      final Number month,
      final Number year) {

    cg_init_Post_1(postTitle, postContent, postAuthor, Utils.copy(postTags), day, month, year);
  }

  public Post editPost(final String newTitle, final String newContent, final VDMSet newTags) {

    title = newTitle;
    content = newContent;
    tagsList = Utils.copy(newTags);
    return this;
  }

  public void addComment(final Comment comment) {

    commentsList = SetUtil.union(Utils.copy(commentsList), SetUtil.set(comment));
  }

  public void removeComment(final Comment comment) {

    commentsList = SetUtil.diff(Utils.copy(commentsList), SetUtil.set(comment));
  }

  public void increaseRating() {

    rating = rating.longValue() + 1L;
    author.addReputation(1L);
  }

  public void decreaseRating() {

    rating = rating.longValue() - 1L;
    author.addReputation(-1L);
  }

  public String getTitle() {

    return title;
  }

  public String getContent() {

    return content;
  }

  public RegisteredUser getAuthor() {

    return author;
  }

  public Date getDate() {

    return date;
  }

  public Number getRating() {

    return rating;
  }

  public Number getViews() {

    return views;
  }

  public VDMSet getTagsList() {

    return Utils.copy(tagsList);
  }

  public VDMSet getCommentsList() {

    return Utils.copy(commentsList);
  }

  public Post() {}

  public String toString() {

    return "Post{"
        + "title := "
        + Utils.toString(title)
        + ", content := "
        + Utils.toString(content)
        + ", author := "
        + Utils.toString(author)
        + ", date := "
        + Utils.toString(date)
        + ", views := "
        + Utils.toString(views)
        + ", rating := "
        + Utils.toString(rating)
        + ", tagsList := "
        + Utils.toString(tagsList)
        + ", commentsList := "
        + Utils.toString(commentsList)
        + "}";
  }
}
