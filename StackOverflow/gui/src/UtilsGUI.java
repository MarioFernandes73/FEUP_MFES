import org.overture.codegen.runtime.SetUtil;
import org.overture.codegen.runtime.VDMSet;

import StackOverflow.*;
import StackOverflow.quotes.*;

public class UtilsGUI {

	public static StackOverflow createStackOverflow() {
		StackOverflow s = new StackOverflow();
		
		AdministratorUser admin = s.createAdministratorUser("Mario", "mariogustavo@live.com.pt", 23, new MasculinoQuote(), 999,"mario", "123");
		s.addUser(admin);
		RegularUser regular = s.createRegularUser("Tiago", "tiagomail@mail.mail", 23, new MasculinoQuote(), 0, "tiago", "123");
		s.addUser(regular);
		
		VDMSet tagsList = SetUtil.set("Tag1", "Tag2", "Tag3");
		Comment comment1 = new Comment("Hi! I need help!!",regular,02,01,2018);
		Comment comment2 = new Comment("Hi what is your problem??",regular,02,01,2018);
		Comment comment3 = new Comment("Hi what is your problem??",regular,02,01,2018);
		Comment comment4 = new Comment("Hi what is your problem??",regular,02,01,2018);
		Comment comment5 = new Comment("Hi what is your problem??",regular,02,01,2018);
		Post post1 = new Post("Help",
				"Hello guys, I have created this post in order to help anyone with any vdm++ doubts. Please comment down below your doubts and i will get to you in time.",
				admin,tagsList,1,1,2018);
		for(int i = 0; i < 10; i++) {
			post1.increaseRating();
		}
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		post1.addComment(comment3);
		post1.addComment(comment4);
		post1.addComment(comment5);
		
		s.addPost(post1);
		
		Post post2 = new Post("Help vdm++",
				"with any vdm++ doubts. Please comment down below your doubts and i will get to you in time.",
				admin,tagsList,2,1,2017);
		
		for(int i = 0; i < 27; i++) {
			post2.increaseRating();
		}
		
		Post post3 = new Post("Help with vdm++",
				"Hello guys, I have created this post in order to help mment down below your doubts and i will get to you in time.",
				admin,tagsList,2,1,2019);
		post3.decreaseRating();
		s.addPost(post2);
		s.addPost(post3);
		
		
		return s;
	}
	
	public static String convertToMultiline(String orig)
	{
		orig = orig.replaceAll("\n", "<br>");
		orig = orig.replaceAll("\\. ", "<br>");
	    return "<html>" + orig;
	}
	
	public static String convertToMultilineTextArea(String orig)
	{
		orig = orig.replaceAll("\\. ", ".\n");
	    return  orig;
	}
	
}
