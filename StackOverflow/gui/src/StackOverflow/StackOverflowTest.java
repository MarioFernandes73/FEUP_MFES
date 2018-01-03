package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

import StackOverflow.quotes.*;

@SuppressWarnings("all")
public class StackOverflowTest {
  private StackOverflow s = new StackOverflow();

  private void assertTrue(final Boolean cond) {

    return;
  }

  private void assertEqual(final Object expected, final Object actual) {

    if (!(Utils.equals(expected, actual))) {
      IO.print("Actual value (");
      IO.print(((Object) actual));
      IO.print(") different from expected (");
      IO.print(((Object) expected));
      IO.println(")\n");
    }
  }

  private void testcreateStackOverflow() {

    GuestUser guest = (GuestUser) s.getCurrentUser();
    assertTrue(guest instanceof GuestUser);
    assertTrue(Utils.equals(guest.getName(), ""));
    assertTrue(Utils.equals(guest.getEmail(), ""));
    assertTrue(Utils.equals(guest.getAge(), 1L));
    assertTrue(Utils.equals(guest.getSex(), MasculinoQuote.getInstance()));
    assertTrue(Utils.equals(guest.getUsername(), ""));
    assertTrue(Utils.equals(guest.getPassword(), ""));
    guest =
        (GuestUser) guest.editUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance());
    assertTrue(Utils.equals(guest.getName(), ""));
    assertTrue(Utils.equals(guest.getEmail(), ""));
    assertTrue(Utils.equals(guest.getAge(), 1L));
    assertTrue(Utils.equals(guest.getSex(), MasculinoQuote.getInstance()));
    assertTrue(Utils.equals(guest.getUsername(), ""));
    assertTrue(Utils.equals(guest.getPassword(), ""));
  }

  private void testCreateRegisteredUser() {

    RegisteredUser newUser =
        new RegisteredUser(
            1L,
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    assertTrue(Utils.equals(newUser.getCanRate(), false));
    assertTrue(Utils.equals(newUser.getCanCreatePost(), false));
    assertTrue(Utils.equals(newUser.getCanEditPost(), false));
    assertTrue(Utils.equals(newUser.getCanRemovePost(), false));
    assertTrue(Utils.equals(newUser.getCanAddComment(), false));
    assertTrue(Utils.equals(newUser.getCanEditComment(), false));
    assertTrue(Utils.equals(newUser.getCanRemoveComment(), false));
    assertTrue(Utils.equals(newUser.getCanBanUsers(), false));
    assertTrue(Utils.equals(newUser.getCanUnbanUsers(), false));
    assertTrue(Utils.equals(newUser.getName(), "Mario"));
    assertTrue(Utils.equals(newUser.getEmail(), "mario.gustavo@hotmail.com"));
    assertTrue(Utils.equals(newUser.getAge(), 23L));
    assertTrue(Utils.equals(newUser.getSex(), MasculinoQuote.getInstance()));
    assertTrue(Utils.equals(newUser.getReputation(), 0L));
    assertTrue(
        Utils.equals(newUser.getBanState(), UnbannedQuote.getInstance()));
    assertTrue(Utils.equals(newUser.getId(), 1L));
    assertEqual(newUser.getPosts(), SetUtil.set());
    assertTrue(Utils.equals(newUser.getUsername(), "mario"));
    assertTrue(Utils.equals(newUser.getPassword(), "12345"));
  }

  private void testCreateRegularUser() {

    RegularUser newUser =
        s.createRegularUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    assertTrue(Utils.equals(newUser.getCanRate(), true));
    assertTrue(Utils.equals(newUser.getCanCreatePost(), true));
    assertTrue(Utils.equals(newUser.getCanEditPost(), true));
    assertTrue(Utils.equals(newUser.getCanRemovePost(), false));
    assertTrue(Utils.equals(newUser.getCanAddComment(), true));
    assertTrue(Utils.equals(newUser.getCanEditComment(), true));
    assertTrue(Utils.equals(newUser.getCanRemoveComment(), false));
    assertTrue(Utils.equals(newUser.getCanBanUsers(), false));
    assertTrue(Utils.equals(newUser.getCanUnbanUsers(), false));
    assertTrue(Utils.equals(newUser.getName(), "Mario"));
    assertTrue(Utils.equals(newUser.getEmail(), "mario.gustavo@hotmail.com"));
    assertTrue(Utils.equals(newUser.getAge(), 23L));
    assertTrue(Utils.equals(newUser.getSex(), MasculinoQuote.getInstance()));
    assertTrue(Utils.equals(newUser.getReputation(), 0L));
    assertTrue(
        Utils.equals(newUser.getBanState(), UnbannedQuote.getInstance()));
    assertTrue(Utils.equals(newUser.getId(), 1L));
    assertEqual(newUser.getPosts(), SetUtil.set());
    assertTrue(Utils.equals(newUser.getUsername(), "mario"));
    assertTrue(Utils.equals(newUser.getPassword(), "12345"));
  }

  private void testCreateAdministratorUser() {

    AdministratorUser newUser =
        s.createAdministratorUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    assertTrue(Utils.equals(newUser.getCanRate(), true));
    assertTrue(Utils.equals(newUser.getCanCreatePost(), true));
    assertTrue(Utils.equals(newUser.getCanEditPost(), true));
    assertTrue(Utils.equals(newUser.getCanRemovePost(), true));
    assertTrue(Utils.equals(newUser.getCanAddComment(), true));
    assertTrue(Utils.equals(newUser.getCanEditComment(), true));
    assertTrue(Utils.equals(newUser.getCanRemoveComment(), true));
    assertTrue(Utils.equals(newUser.getCanBanUsers(), true));
    assertTrue(Utils.equals(newUser.getCanUnbanUsers(), true));
    assertTrue(Utils.equals(newUser.getName(), "Mario"));
    assertTrue(Utils.equals(newUser.getEmail(), "mario.gustavo@hotmail.com"));
    assertTrue(Utils.equals(newUser.getAge(), 23L));
    assertTrue(Utils.equals(newUser.getSex(), MasculinoQuote.getInstance()));
    assertTrue(Utils.equals(newUser.getReputation(), 0L));
    assertTrue(
        Utils.equals(newUser.getBanState(), UnbannedQuote.getInstance()));
  }

  private void testBanUser() {

    AdministratorUser newUser =
        s.createAdministratorUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    RegularUser newUser2 =
        s.createRegularUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    AdministratorUser newUser3 =
        s.createAdministratorUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    assertTrue(
        Utils.equals(newUser2.getBanState(), UnbannedQuote.getInstance()));
    assertTrue(
        Utils.equals(newUser3.getBanState(), UnbannedQuote.getInstance()));
    newUser.banUser(newUser2);
    newUser.banUser(newUser3);
    assertTrue(
        Utils.equals(newUser2.getBanState(), BannedQuote.getInstance()));
    assertTrue(
        Utils.equals(newUser3.getBanState(), BannedQuote.getInstance()));
    newUser.unbanUser(newUser2);
    newUser.unbanUser(newUser3);
    assertTrue(
        Utils.equals(newUser2.getBanState(), UnbannedQuote.getInstance()));
    assertTrue(
        Utils.equals(newUser3.getBanState(), UnbannedQuote.getInstance()));
  }

  private void testAddUser() {

    RegularUser newUser =
        s.createRegularUser(
            "Mario",
            "mario.gustavo@hotmail.com",
            23L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    Number usersLength = s.getUsers().size();
    s.addUser(newUser);
    assertTrue(Utils.equals(usersLength.longValue() + 1L, s.getUsers().size()));
    assertTrue(SetUtil.inSet(newUser, s.getUsers()));
  }

  private void testAddPost() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Number postsLength = s.getPosts().size();
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    assertTrue(Utils.equals(postsLength.longValue() + 1L, s.getPosts().size()));
    assertTrue(SetUtil.inSet(newPost, s.getPosts()));
    assertTrue(SetUtil.inSet(newPost, user.getPosts()));
    assertEqual(newPost.getAuthor(), user);
    assertEqual(newPost.getDate().day, 29L);
    assertEqual(newPost.getDate().month, 12L);
    assertEqual(newPost.getDate().year, 2017L);
    assertEqual(newPost.getViews(), 0L);
    assertEqual(newPost.getRating(), 0L);
  }

  private void testEditPost() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    String title = newPost.getTitle();
    VDMSet tags = newPost.getTagsList();
    newPost = s.editPost(newPost, title, "New content", Utils.copy(tags));
    assertTrue(Utils.equals(newPost.getTitle(), "Title"));
    assertTrue(Utils.equals(newPost.getContent(), "New content"));
    assertEqual(newPost.getAuthor(), user);
    assertEqual(newPost.getTagsList(), SetUtil.set("Tag1", "Tag2", "Tag3"));
    assertEqual(newPost.getDate().day, 29L);
    assertEqual(newPost.getDate().month, 12L);
    assertEqual(newPost.getDate().year, 2017L);
  }

  private void testRating() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Comment newComment = s.addComment(newPost, "Content", user, 29L, 12L, 2017L);
    assertEqual(newPost.getRating(), 0L);
    assertEqual(newComment.getRating(), 0L);
    assertEqual(user.getReputation(), 0L);
    newPost.increaseRating();
    newComment.increaseRating();
    assertEqual(newPost.getRating(), 1L);
    assertEqual(newComment.getRating(), 1L);
    assertEqual(user.getReputation(), 4L);
    newPost.decreaseRating();
    newPost.decreaseRating();
    newComment.decreaseRating();
    newComment.decreaseRating();
    assertEqual(newPost.getRating(), -1L);
    assertEqual(newComment.getRating(), -1L);
    assertEqual(user.getReputation(), -2L);
  }

  private void testRemovePost() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Number postsLength = s.getPosts().size();
    s.deletePost(newPost);
    assertTrue(Utils.equals(postsLength.longValue() - 1L, s.getPosts().size()));
    assertTrue(!(SetUtil.inSet(newPost, s.getPosts())));
    assertTrue(!(SetUtil.inSet(newPost, newPost.getAuthor().getPosts())));
  }

  private void testAddComment() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Comment newComment = s.addComment(newPost, "Content", user, 29L, 12L, 2017L);
    assertTrue(SetUtil.inSet(newComment, newPost.getCommentsList()));
    assertTrue(SetUtil.inSet(newComment, user.getComments()));
    assertEqual(newComment.getContent(), "Content");
    assertEqual(newComment.getDate().day, 29L);
    assertEqual(newComment.getDate().month, 12L);
    assertEqual(newComment.getDate().year, 2017L);
  }

  private void testEditComment() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Comment newComment = s.addComment(newPost, "Content", user, 29L, 12L, 2017L);
    newComment = s.editComment(newComment, "New Content");
    assertTrue(SetUtil.inSet(newComment, newPost.getCommentsList()));
    assertTrue(SetUtil.inSet(newComment, user.getComments()));
    assertEqual(newComment.getContent(), "New Content");
    assertEqual(newComment.getDate().day, 29L);
    assertEqual(newComment.getDate().month, 12L);
    assertEqual(newComment.getDate().year, 2017L);
  }

  private void testRemoveComment() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Comment newComment = s.addComment(newPost, "Content", user, 29L, 12L, 2017L);
    s.deleteComment(newPost, newComment);
    assertTrue(!(SetUtil.inSet(newComment, newPost.getCommentsList())));
    assertTrue(!(SetUtil.inSet(newComment, user.getComments())));
  }

  private void testSearchUser() {

    RegularUser newUser =
        s.createRegularUser(
            "Rafael",
            "mario.gustavo@hotmail.com",
            27L,
            MasculinoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    s.addUser(newUser);
    assertEqual(s.searchUsersByName("Rafael"), SetUtil.set(newUser));
    assertEqual(s.searchUsersByAge(27L), SetUtil.set(newUser));
  }

  private void testLogin() {

    RegularUser newUser =
        s.createRegularUser(
            "Jorge",
            "mario.gustavo@hotmail.com",
            27L,
            MasculinoQuote.getInstance(),
            0L,
            "jj",
            "12345");
    Boolean tempBool = false;
    s.addUser(newUser);
    tempBool = s.tryLogin("j", "12345");
    assertTrue(Utils.equals(tempBool, false));
    tempBool = s.tryLogin("jj", "12345");
    assertTrue(tempBool);
    assertEqual(newUser, s.getCurrentUser());
  }

  private void testSearchPost() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    VDMSet tagsList2 = SetUtil.set("Tag3");
    Post newPost = s.createPost("Title4", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Post newPost2 =
        s.createPost(
            "teste para Title7 meio", "Content", user, Utils.copy(tagsList2), 29L, 12L, 2017L);
    assertEqual(s.searchPostsByTags("Tag1"), SetUtil.set(newPost));
    assertEqual(s.searchPostsByTags("Tag3"), SetUtil.set(newPost, newPost2));
    assertEqual(s.searchPostsByTitle("Title7"), SetUtil.set(newPost2));
  }

  private void testEditUser() {

    RegularUser newUser =
        s.createRegularUser(
            "Ana",
            "ana@hotmail.com",
            27L,
            FemininoQuote.getInstance(),
            0L,
            "aa",
            "12345");
    Boolean tempBool = false;
    s.addUser(newUser);
    tempBool = s.tryLogin("aa", "12345");
    s.editUser(
        "Mario",
        "mario.gustavo@hotmail.com",
        23L,
        MasculinoQuote.getInstance());
    assertTrue(Utils.equals(s.getCurrentUser().getName(), "Mario"));
    assertTrue(Utils.equals(s.getCurrentUser().getEmail(), "mario.gustavo@hotmail.com"));
    assertTrue(Utils.equals(s.getCurrentUser().getAge(), 23L));
    assertTrue(
        Utils.equals(
            s.getCurrentUser().getSex(), MasculinoQuote.getInstance()));
    s.editUser("Ana", "ana@hotmail.com", 27L, FemininoQuote.getInstance());
    assertTrue(Utils.equals(s.getCurrentUser().getName(), "Ana"));
    assertTrue(Utils.equals(s.getCurrentUser().getEmail(), "ana@hotmail.com"));
    assertTrue(Utils.equals(s.getCurrentUser().getAge(), 27L));
    assertTrue(
        Utils.equals(
            s.getCurrentUser().getSex(), FemininoQuote.getInstance()));
  }

  private void testOrderPosts() {

    RegularUser user =
        new RegularUser(
            1L,
            "User",
            "email@gmail.com",
            47L,
            FemininoQuote.getInstance(),
            0L,
            "mario",
            "12345");
    VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
    Post newPost = s.createPost("Title", "Content", user, Utils.copy(tagsList), 1L, 1L, 2015L);
    Post newPost2 = s.createPost("Title", "Content", user, Utils.copy(tagsList), 29L, 12L, 2017L);
    Post newPost3 = s.createPost("Title2", "Content2", user, Utils.copy(tagsList), 27L, 5L, 2017L);
    Post newPost4 = s.createPost("Title", "Content", user, Utils.copy(tagsList), 31L, 3L, 2016L);
    Post newPost5 = s.createPost("Title", "Content", user, Utils.copy(tagsList), 1L, 12L, 2017L);
    Post newPost6 = s.createPost("Title", "Content", user, Utils.copy(tagsList), 27L, 5L, 2017L);
    newPost2.increaseRating();
    newPost2.increaseRating();
    newPost3.increaseRating();
    newPost4.decreaseRating();
    newPost5.increaseRating();
    newPost5.increaseRating();
    newPost6.decreaseRating();
    assertEqual(
        s.getPosts(), SetUtil.set(newPost, newPost2, newPost3, newPost4, newPost5, newPost6));
    assertEqual(
        s.orderPostsByDate(s.getPosts()),
        SetUtil.set(newPost2, newPost5, newPost3, newPost6, newPost4, newPost));
    assertEqual(
        s.orderPostsByRating(s.getPosts()),
        SetUtil.set(newPost4, newPost6, newPost, newPost3, newPost2, newPost5));
  }

  private void testDates() {

    Date date1 = new Date(2017L, 5L, 23L);
    Date date2 = new Date(2017L, 5L, 29L);
    assertTrue(Date.compareDates(date2, date1));
    assertEqual(Date.compareDates(date1, date2), false);
    assertEqual(Date.DaysOfMonth(4L), 30L);
    assertEqual(Date.DaysOfMonth(2L), 28L);
    assertEqual(Date.DaysOfMonth(1L), 31L);
  }

  public static void main() {

    new StackOverflowTest().testcreateStackOverflow();
    new StackOverflowTest().testCreateRegisteredUser();
    new StackOverflowTest().testCreateRegularUser();
    new StackOverflowTest().testCreateAdministratorUser();
    new StackOverflowTest().testBanUser();
    new StackOverflowTest().testAddUser();
    new StackOverflowTest().testAddPost();
    new StackOverflowTest().testEditPost();
    new StackOverflowTest().testRemovePost();
    new StackOverflowTest().testSearchUser();
    new StackOverflowTest().testLogin();
    new StackOverflowTest().testAddComment();
    new StackOverflowTest().testEditComment();
    new StackOverflowTest().testRemoveComment();
    new StackOverflowTest().testRating();
    new StackOverflowTest().testSearchPost();
    new StackOverflowTest().testEditUser();
    new StackOverflowTest().testOrderPosts();
    new StackOverflowTest().testDates();
  }

  public StackOverflowTest() {}

  public String toString() {

    return "StackOverflowTest{" + "s := " + Utils.toString(s) + "}";
  }
}
