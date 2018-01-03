package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Comment {
  private String content;
  private RegisteredUser author;
  private Date date;
  private Number rating = 0L;

  public void cg_init_Comment_1(
      final String commentContent,
      final RegisteredUser commentAuthor,
      final Number day,
      final Number month,
      final Number year) {

    content = commentContent;
    author = commentAuthor;
    date = new Date(year, month, day);
  }

  public Comment(
      final String commentContent,
      final RegisteredUser commentAuthor,
      final Number day,
      final Number month,
      final Number year) {

    cg_init_Comment_1(commentContent, commentAuthor, day, month, year);
  }

  public Comment editComment(final String newContent) {

    content = newContent;
    return this;
  }

  public void increaseRating() {

    rating = rating.longValue() + 1L;
    author.addReputation(3L);
  }

  public void decreaseRating() {

    rating = rating.longValue() - 1L;
    author.addReputation(-2L);
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

  public Comment() {}

  public String toString() {

    return "Comment{"
        + "content := "
        + Utils.toString(content)
        + ", author := "
        + Utils.toString(author)
        + ", date := "
        + Utils.toString(date)
        + ", rating := "
        + Utils.toString(rating)
        + "}";
  }
}
