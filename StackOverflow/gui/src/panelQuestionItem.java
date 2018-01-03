import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import StackOverflow.Post;

public class panelQuestionItem extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JPanel panel_6 = new JPanel();
	private final JPanel panel_7 = new JPanel();
	private final JLabel lblRating;
	private final JLabel lblQuestion;
	private final JLabel lblTitleTags;
	private final Post post;

	public panelQuestionItem(Post post, JLabel label) {
		this.post = post;
		
		lblRating = new JLabel("Rating : " + post.getRating().toString());
		lblQuestion = new JLabel(UtilsGUI.convertToMultiline(post.getContent()));
		Object[] tags = (Object [])post.getTagsList().toArray();
		String tagStr = "";
		for(int i = 0; i < tags.length; i++) {
			tagStr+=tags[i].toString();
			if(i != tags.length - 1) {
				tagStr+= " ";
			}
		}
		
		this.lblTitleTags = label;
		lblTitleTags.setText(UtilsGUI.convertToMultiline(post.getTitle() + "\n" + tagStr));
				
				
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		setLayout(new BorderLayout(0, 0));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));
		lblRating.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_3.add(lblRating);
		
		add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(2, 0, 0, 0));
		panel_7.setBorder(new LineBorder(new Color(255, 140, 0)));
		
		panel_5.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		lblTitleTags.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_7.add(lblTitleTags, BorderLayout.CENTER);
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		
		panel_5.add(panel_6);
		
		panel_6.add(lblQuestion);
		
	}
	
}
