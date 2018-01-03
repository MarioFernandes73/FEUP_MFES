import javax.swing.*;

import org.overture.codegen.runtime.VDMSet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

import StackOverflow.*;
import StackOverflow.quotes.*;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class MFES	 {

	private StackOverflow s = UtilsGUI.createStackOverflow();
	private Post selectedPost;	
	
	JFrame frame = new JFrame("MFES");
	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JPanel panelThird = new JPanel();
	JPanel panelFourth = new JPanel();
	JPanel panelFifth = new JPanel();
	JPanel panelSixth = new JPanel();
	JPanel panelSeventh = new JPanel();
	JPanel panelEigth = new JPanel();
	CardLayout cl = new CardLayout();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel = new JPanel();
	private final JButton registerButton = new JButton("Register");
	private final JButton loginButton = new JButton("Login");
	private final JTextField searchQuery = new JTextField();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JLabel lblName = new JLabel("Name");
	private final JLabel lblAge = new JLabel("Age");
	private final JLabel lblEmail = new JLabel("Email");
	private final JLabel lblSex = new JLabel("Sex");
	private final JLabel lblUsername = new JLabel("  Username  ");
	private final JLabel lblPassword = new JLabel("Password");
	private final JPanel panel_6 = new JPanel();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JButton btnRegister = new JButton("Register");
	private final JLabel lblErrorOnRegister = new JLabel("");
	private final JComboBox comboBox = new JComboBox(new String[] {"Male","Female"});
	private final JTextField textField_4 = new JTextField();
	private final JTextField textField_5 = new JTextField();
	private final JPanel panel_7 = new JPanel();
	private final JButton btnSearchByTitle = new JButton("Search by Title");
	private final JButton btnSearchByTags = new JButton("Search by Tags");
	private final JPanel panel_8 = new JPanel();
	private final JPanel panel_9 = new JPanel();
	private final JLabel lblErrorOnLogin = new JLabel(" ");
	private final JPanel panel_10 = new JPanel();
	private final JLabel lblUsername_1 = new JLabel("Username");
	private final JTextField txtUsername = new JTextField();
	private final JLabel lblPassword_1 = new JLabel("Password");
	private final JTextField txtPassword = new JTextField();
	private final JButton btnLogin = new JButton("Login");
	private final JButton btnBack2 = new JButton("Back");
	private final JLabel label = new JLabel("User Login Form");
	private final JButton btnBack = new JButton("Back");
	private final JLabel label_1 = new JLabel("User registration form");
	private final JPanel panel_11 = new JPanel();
	private final JButton btnBack_1 = new JButton("Back");
	private final JLabel lblPostVisualization = new JLabel("Post Visualization");
	private final JPanel panel_12 = new JPanel();
	private final JButton btnBack_2 = new JButton("Back");
	private final JLabel lblResultsVisualization = new JLabel("Results Visualization");
	private final JPanel panel_13 = new JPanel();
	private final JButton btnBack_3 = new JButton("Back");
	private final JLabel lblUserManagement = new JLabel("User Management");
	private final JPanel usersPanel = new JPanel();
	private final JScrollPane usersManagement = new JScrollPane(usersPanel);
	private final JPanel panelResults = new JPanel();
	private final JScrollPane postsResults = new JScrollPane(panelResults);
	private final JPanel commentSection = new JPanel();
	private final JPanel postSection = new JPanel();
	private final JScrollPane commentsPost = new JScrollPane(commentSection);
	private final JPanel panel_14 = new JPanel();
	private final JButton button = new JButton("Back");
	private final JLabel lblPostFactory = new JLabel("Post Factory");
	private final JPanel panel_15 = new JPanel();
	private final JButton button_1 = new JButton("Back");
	private final JLabel lblProfile = new JLabel("Profile");
	private final JPanel panel_16 = new JPanel();
	private final JPanel panel_17 = new JPanel();
	private final JPanel panel_18 = new JPanel();
	private final JButton btnEditPost = new JButton("Edit existing post");
	private final JButton btnCreateNewPost = new JButton("Create new post");
	private final JPanel panel_19 = new JPanel();
	private final JPanel postLabels = new JPanel();
	private final JPanel postContent = new JPanel();
	private final JLabel lblTitle = new JLabel("Title: ");
	private final JLabel lblContent = new JLabel("  Content:  ");
	private final JLabel lblTagList = new JLabel("<html> Tag List:  <br>(ex: Tag1,Tag2)");
	private final JTextArea postTitleEntry = new JTextArea();
	private final JTextArea postContentEntry = new JTextArea();
	private final JTextField postTagsEntry = new JTextField();
	private final JPanel panelLoggedIn = new JPanel();
	private final JPanel panelMiddle = new JPanel();
	private final JButton btnCreateNewPost_1 = new JButton("Create new Post");
	private final JButton btnViewProfile = new JButton("View Profile");
	private final JPanel profileLabels = new JPanel();
	private final JLabel label_2 = new JLabel("Name");
	private final JLabel label_3 = new JLabel("Age");
	private final JLabel label_4 = new JLabel("Email");
	private final JLabel label_5 = new JLabel("Sex");
	private final JLabel label_6 = new JLabel("  Username  ");
	private final JPanel profileEntries = new JPanel();
	private final JPanel panel_20 = new JPanel();
	private final JPanel panel_21 = new JPanel();
	private final JPanel postsInfoProfile = new JPanel();
	private final JLabel lblReputation = new JLabel("Reputation:");
	private final JLabel lblPostsCount = new JLabel("Posts Count:");
	private final JLabel lblCommentsCount = new JLabel("Comments Count:");
	private final JPanel panelOrderButtons = new JPanel();
	private final JPanel panelResultsContent = new JPanel();
	private final JButton btnOrderByRating = new JButton("Order by Rating");
	private final JButton btnOrderByDate = new JButton("Order by Date");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MFES();
			}
		});
	
	}

	/**
	 * Create the frame.
	 */
	public MFES() {
		panelResults.setLayout(new BorderLayout(0, 0));
		
		panelResults.add(panelOrderButtons, BorderLayout.NORTH);

		
		panelResults.add(panelResultsContent, BorderLayout.CENTER);
		postTagsEntry.setColumns(10);
		txtPassword.setColumns(10);
		txtUsername.setColumns(10);
		textField_5.setColumns(10);
		textField_4.setColumns(10);
		textField_3.setColumns(10);
		textField_2.setColumns(10);
		textField_1.setColumns(10);
		
		
		searchQuery.setColumns(10);
		panelCont.setLayout(cl);
		
		this.addButtonFunctions();
		
		
		panelCont.add(panelFirst, "1");
		panelFirst.setLayout(new BorderLayout(0, 0));
		
		panelFirst.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_1.add(searchQuery);
		
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 0, 0, 0));
		btnSearchByTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					panelResultsContent.removeAll();
					setupResultsVisualization(s.searchPostsByTitle(searchQuery.getText()).toArray());
					cl.show(panelCont, "5");
				} catch (Exception ex1) {
					System.out.println(ex1.getMessage());
				}
			}
		});
		
		panel_7.add(btnSearchByTitle);
		btnSearchByTags.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					panelResultsContent.removeAll();
					setupResultsVisualization(s.searchPostsByTags(searchQuery.getText()).toArray());
					cl.show(panelCont, "5");
				} catch (Exception ex1) {
					System.out.println(ex1.getMessage());
				}
			}
		});
		
		panel_7.add(btnSearchByTags);
		
		panelFirst.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelFirst.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(panelLoggedIn, BorderLayout.NORTH);
		panelLoggedIn.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel.add(panelMiddle, BorderLayout.CENTER);
		panelMiddle.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.createFirstItems();
		
		panelCont.add(panelSecond, "2");
		panelSecond.setLayout(new BorderLayout(0, 0));
		
		panelSecond.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_3.add(btnBack);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		panel_3.add(label_1);
		
		panelSecond.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Object sex;
					if(comboBox.getSelectedIndex() == 0) {
						sex = new MasculinoQuote();
					} else {
						sex = new FemininoQuote();
					}
					User user = s.createRegularUser(textField_1.getText(), textField_3.getText(),Integer.parseInt(textField_2.getText()),sex,0,textField_4.getText(),textField_5.getText());
					s.addUser(user);
					lblErrorOnRegister.setForeground(Color.GREEN);
					lblErrorOnRegister.setText("Success!");
					textField_1.setText("");
					textField_3.setText("");
					textField_2.setText("");
					textField_4.setText("");
					textField_5.setText("");
					cl.show(panelCont, "1");
				} catch (Exception e) {
					lblErrorOnRegister.setForeground(Color.RED);
					lblErrorOnRegister.setText("Error on register.");
				}
			}
		});
		
		panelCont.add(panelThird, "3");
		panelThird.setLayout(new BorderLayout(0, 0));
		
		panelThird.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_8.add(btnBack2);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		panel_8.add(label);
		
		panelThird.add(panel_9, BorderLayout.SOUTH);
		
		panel_9.add(lblErrorOnLogin);
		
		panelThird.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(5, 0, 0, 10));
		lblUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_10.add(lblUsername_1);
		
		panel_10.add(txtUsername);
		lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_10.add(lblPassword_1);
		
		panel_10.add(txtPassword);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					boolean temp = s.tryLogin(txtUsername.getText(), txtPassword.getText());
					if(temp) {
						panel_2.remove(registerButton);
						panel_2.remove(loginButton);
						
						btnCreateNewPost_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								postTitleEntry.setText("");
								postContentEntry.setText("");
								postTagsEntry.setText("");
								cl.show(panelCont, "7");
							}
						});
						
						btnViewProfile.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								setupProfile((RegisteredUser)s.getCurrentUser());
								cl.show(panelCont, "8");
							}
						});
						
						panelLoggedIn.add(btnCreateNewPost_1);
						panelLoggedIn.add(btnViewProfile);
						
						if(s.getCurrentUser() instanceof AdministratorUser) {
							JButton btnUsersManagement = new JButton("Users Management");
							btnUsersManagement.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									cl.show(panelCont, "6");
								}
							});
							panel_2.add(btnUsersManagement);
						} else {
							panel_2.add(new JLabel(""));
						}
						panel_2.add(new JLabel("Logged in as " + s.getCurrentUser().getName(), SwingConstants.CENTER));
						cl.show(panelCont, "1");
					} else {
						lblErrorOnLogin.setForeground(Color.RED);
						lblErrorOnLogin.setText("Error on login.");
					}
				} catch (Exception ex){
					lblErrorOnLogin.setForeground(Color.RED);
					lblErrorOnLogin.setText("Error on login.");
				}
			}
		});
		
		panel_10.add(btnLogin);
		
		
		panelCont.add(panelFourth, "4");
		panelFourth.setLayout(new BorderLayout(0, 0));
		
		panelFourth.add(panel_11, BorderLayout.NORTH);
		panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_11.add(btnBack_1);
		lblPostVisualization.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPostVisualization.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_11.add(lblPostVisualization);
		
		commentsPost.setPreferredSize(new Dimension(100,200));
		
		panelFourth.add(commentsPost, BorderLayout.SOUTH);
		
		panelFourth.add(postSection, BorderLayout.CENTER);
		
		
		panelCont.add(panelFifth, "5");
		panelFifth.setLayout(new BorderLayout(0, 0));
		
		panelFifth.add(panel_12, BorderLayout.NORTH);
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_12.add(btnBack_2);
		lblResultsVisualization.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResultsVisualization.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_12.add(lblResultsVisualization);
		
		postsResults.setPreferredSize(new Dimension(100,300));
		
		panelFifth.add(postsResults, BorderLayout.CENTER);
		
		
		panelCont.add(panelSixth, "6");
		panelSixth.setLayout(new BorderLayout(0, 0));
		
		panelSixth.add(panel_13, BorderLayout.NORTH);
		panel_13.setLayout(new GridLayout(0, 2, 0, 0));
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_13.add(btnBack_3);
		lblUserManagement.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUserManagement.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_13.add(lblUserManagement);
		
		panelSixth.add(usersManagement,BorderLayout.CENTER);
		usersPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.setupUsersPanel();
		
		panelCont.add(panelSeventh, "7");
		panelSeventh.setLayout(new BorderLayout(0, 0));
		
		panelSeventh.add(panel_14, BorderLayout.NORTH);
		panel_14.setLayout(new GridLayout(0, 2, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_14.add(button);
		lblPostFactory.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostFactory.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		panel_14.add(lblPostFactory);
		
		panelSeventh.add(panel_17, BorderLayout.CENTER);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		panel_17.add(panel_18, BorderLayout.SOUTH);
		panel_18.setLayout(new GridLayout(0, 2, 0, 0));
		btnEditPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] tags = postTagsEntry.getText().split("[,]");
				VDMSet tagSet = new VDMSet();
				for(int i = 0; i < tags.length; i++) {
					tagSet.add(tags[i]);
				}
				s.editPost(selectedPost, postTitleEntry.getText(), postContentEntry.getText(),tagSet);
				createFirstItems();
				cl.show(panelCont, "1");
			}
		});
		
		panel_18.add(btnEditPost);
		btnCreateNewPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] tags = postTagsEntry.getText().split("[,]");
			VDMSet tagSet = new VDMSet();
			for(int i = 0; i < tags.length; i++) {
				tagSet.add(tags[i]);
			}
			Calendar now = Calendar.getInstance();
			Post tempPost = s.createPost(postTitleEntry.getText(), postContentEntry.getText(), (RegisteredUser) s.getCurrentUser(), tagSet, now.get(Calendar.DAY_OF_MONTH),now.get(Calendar.MONTH)+1,now.get(Calendar.YEAR));
			s.addPost(tempPost);
			createFirstItems();
			setupPostVisualization(tempPost);
			cl.show(panelCont, "4");
			}
		});
		
		panel_18.add(btnCreateNewPost);
		
		panel_17.add(panel_19, BorderLayout.CENTER);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		panel_19.add(postLabels, BorderLayout.WEST);
		postLabels.setLayout(new GridLayout(3, 0, 0, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		postLabels.add(lblTitle);
		lblContent.setHorizontalAlignment(SwingConstants.CENTER);
		
		postLabels.add(lblContent);
		lblTagList.setHorizontalAlignment(SwingConstants.CENTER);
		
		postLabels.add(lblTagList);
		
		panel_19.add(postContent, BorderLayout.CENTER);
		postContent.setLayout(new GridLayout(3, 0, 0, 15));
		
		postContent.add(postTitleEntry);
		
		postContent.add(postContentEntry);
		
		postContent.add(postTagsEntry);
		
		
		panelCont.add(panelEigth, "8");
		panelEigth.setLayout(new BorderLayout(0, 0));
		
		panelEigth.add(panel_15, BorderLayout.NORTH);
		panel_15.setLayout(new GridLayout(0, 2, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "1");
			}
		});
		
		panel_15.add(button_1);
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		panel_15.add(lblProfile);
		
		panelEigth.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(new BorderLayout(0, 0));
		profileLabels.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_16.add(profileLabels, BorderLayout.WEST);
		profileLabels.setLayout(new GridLayout(5, 0, 0, 10));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		profileLabels.add(label_2);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		profileLabels.add(label_3);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		profileLabels.add(label_4);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		profileLabels.add(label_5);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		profileLabels.add(label_6);
		profileEntries.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_16.add(profileEntries, BorderLayout.CENTER);
		
		panel_16.add(panel_20, BorderLayout.SOUTH);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_16.add(panel_21, BorderLayout.EAST);
		panel_21.setLayout(new GridLayout(0, 1, 0, 0));
		postsInfoProfile.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_21.add(postsInfoProfile);
		postsInfoProfile.setLayout(new GridLayout(3, 1, 0, 0));
		lblReputation.setHorizontalAlignment(SwingConstants.CENTER);
		
		postsInfoProfile.add(lblReputation);
		lblPostsCount.setHorizontalAlignment(SwingConstants.CENTER);
		
		postsInfoProfile.add(lblPostsCount);
		
		postsInfoProfile.add(lblCommentsCount);
		
		panel_4.add(btnRegister, BorderLayout.EAST);
		lblErrorOnRegister.setForeground(new Color(255, 69, 0));
		
		panel_4.add(lblErrorOnRegister, BorderLayout.CENTER);
		
		panelSecond.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new GridLayout(6, 0, 0, 10));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblName);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblAge);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblEmail);
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblSex);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblUsername);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_5.add(lblPassword);
		
		panelSecond.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(6, 0, 0, 10));
		
		panel_6.add(textField_1);
		
		panel_6.add(textField_2);
		
		panel_6.add(textField_3);
		
		panel_6.add(comboBox);
		
		panel_6.add(textField_4);
		
		panel_6.add(textField_5);
		cl.show(panelCont, "1");
		
		frame.getContentPane().setPreferredSize(new Dimension(500,500));
		frame.getContentPane().add(panelCont);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createFirstItems() {
		panelMiddle.removeAll();
		Object[] posts = (Object[])s.getPosts().toArray();
		for(int i = 0; i < posts.length; i++ ) {
			final Post currentPost = (Post)posts[i];
			if(i >= 3)
				break;
			JLabel labelTemp = new JLabel();
			labelTemp.addMouseListener(new MouseAdapter() {
				
		        public void mouseClicked(MouseEvent e)   
		        {   
		        	setupPostVisualization(currentPost);
		            cl.show(panelCont, "4");
		        }   
		        
			});
			panelMiddle.add(new panelQuestionItem(currentPost,labelTemp));
		}
	}
	
	private void addButtonFunctions() {
		panel_2.add(registerButton);
		
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "2");
			}
		});
		panel_2.add(loginButton);
		
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "3");
			}
		});
		
	}
	
	private void setupUsersPanel() {
		Object[] users = s.getUsers().toArray();
		usersPanel.setLayout(new GridLayout(users.length,0,0,10));
		for(int i = 0; i < users.length; i++) {
			RegisteredUser currentUser = (RegisteredUser)users[i];
			JPanel comp = new JPanel();
			comp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			comp.setPreferredSize(new Dimension(100,100));
			comp.setLayout(new GridLayout(0,2,0,0));
			
			
			JPanel info = new JPanel();
			JPanel banActions = new JPanel();
			
			info.setLayout(new GridLayout(2,0,0,0));
			banActions.setLayout(new GridLayout(2,0,0,0));
			
			JButton banButton = new JButton("Ban");
			JButton unbanButton = new JButton("Unban");
			
			banButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					currentUser.setBanState(new BannedQuote());
					usersPanel.removeAll();
					setupUsersPanel();
					cl.show(panelCont, "1");
					cl.show(panelCont, "6");
				}
			});
			
			banButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					currentUser.setBanState(new UnbannedQuote());
					usersPanel.removeAll();
					setupUsersPanel();
					cl.show(panelCont, "1");
					cl.show(panelCont, "6");
				}
			});
			
			banActions.add(banButton);
			banActions.add(unbanButton);
			
			banActions.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			JPanel personalInfo = new JPanel();
			JPanel postsInfo = new JPanel();
			
			personalInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			postsInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK));

			personalInfo.setLayout(new GridLayout(7,0,0,0));
			postsInfo.setLayout(new GridLayout(3,0,0,0));
			
			String sex = "";
			
			if(currentUser.getSex() instanceof MasculinoQuote) {
				sex = "Male";
			} else {
				sex = "Female";
			}
			
			personalInfo.add(new JLabel("ID: "+ currentUser.getId() ));
			personalInfo.add(new JLabel("Name: "+ currentUser.getName() ));
			personalInfo.add(new JLabel("Email: "+ currentUser.getEmail() ));
			personalInfo.add(new JLabel("Age: "+ currentUser.getAge() ));
			personalInfo.add(new JLabel("Sex: "+ sex ));
			personalInfo.add(new JLabel("Username: "+ currentUser.getUsername() ));
			JLabel banState = new JLabel();
			
			if(currentUser.getBanState() instanceof BannedQuote) {
				banState.setText("User is banned");
				banState.setForeground(Color.RED);
			} else {
				banState.setText("User is not banned");
				banState.setForeground(Color.GREEN);
			}
			
			personalInfo.add(banState);
			
			postsInfo.add(new JLabel("Posts count: " + currentUser.getPosts().size()));
			postsInfo.add(new JLabel("Comments count: " + currentUser.getComments().size()));
			postsInfo.add(new JLabel("Reputation: "+ currentUser.getReputation() ));
			
			info.add(personalInfo);
			info.add(postsInfo);
			
			comp.add(info);
			comp.add(banActions);
			
			
			
			usersPanel.add(comp);
		}
	}
	
	
	private void setupResultsVisualization(Object[] postList) {
		
		panelOrderButtons.setLayout(new GridLayout(0, 2, 0, 0));
		btnOrderByRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Arrays.sort(postList, (a,b) -> ((Comparable<String>) ((Post) b).getRating().toString()).compareTo(((Post) a).getRating().toString()));

				setupResultsVisualization(postList);
				cl.show(panelCont, "1");
				cl.show(panelCont, "5");
			}
		});
		
		panelOrderButtons.add(btnOrderByRating);
		btnOrderByDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] orderedPosts = postList;			
				
				for(int i = 0; i< orderedPosts.length; i++)
				{ 
				    for(int j = 0; j< orderedPosts.length-1; j++)
				    {
				        if(compareDates(((Post)orderedPosts[j+1]).getDate(),((Post)orderedPosts[j]).getDate()))
				        {
				            Object temp=orderedPosts[j+1];
				            orderedPosts[j+1]=orderedPosts[j];
				            orderedPosts[j]=temp;  
				        }
				    }
				}

				
				setupResultsVisualization(orderedPosts);
				cl.show(panelCont, "1");
				cl.show(panelCont, "5");
			}
		});
		panelOrderButtons.add(btnOrderByDate);
		panelResultsContent.removeAll();
		if(postList.length == 0) {
			panelResultsContent.setLayout(new GridLayout(1,0,0,10));
			panelResultsContent.add(new JLabel("No results have been found.", SwingConstants.CENTER));
		} else {
			panelResultsContent.setLayout(new GridLayout(postList.length,0,0,10));
			for(int i = 0; i < postList.length; i++) {
				
				final Post currentPost = (Post)postList[i];
				
				JLabel labelTemp = new JLabel();
				
				labelTemp.addMouseListener(new MouseAdapter() {
					
			        public void mouseClicked(MouseEvent e)   
			        {   
			        	setupPostVisualization(currentPost);
			              cl.show(panelCont, "4");
			        }   
			        
				});
				panelResultsContent.add(new panelQuestionItem(currentPost,labelTemp));
			}
		}
	}

	private boolean compareDates(Date date1, Date date2) {
		if(Integer.parseInt(date1.year.toString())<Integer.parseInt(date2.year.toString())) {
			return true;
		} else if (Integer.parseInt(date1.year.toString()) == Integer.parseInt(date2.year.toString()) && Integer.parseInt(date1.month.toString()) < Integer.parseInt(date2.month.toString()) ){
			return true;
		} else if (Integer.parseInt(date1.year.toString()) == Integer.parseInt(date2.year.toString()) && Integer.parseInt(date1.month.toString()) == Integer.parseInt(date2.month.toString()) && Integer.parseInt(date1.day.toString()) < Integer.parseInt(date2.day.toString()) ) {
			return true;
		}
		return false;
		}
	
	private void setupPostVisualization(Post post) {
		post.increaseViews();
		postSection.removeAll();
		commentSection.removeAll();
		postSection.setPreferredSize(new Dimension(100,100));
		postSection.setLayout(new GridLayout(2,0,0,0));
		JPanel titleSection = new JPanel();
		titleSection.setLayout(new GridLayout(0,2,0,0));
		titleSection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		titleSection.add(new JLabel(post.getTitle(),SwingConstants.CENTER));

		JPanel authorSection = new JPanel();
		if(s.getCurrentUser() instanceof RegisteredUser) {
			if(((RegisteredUser)s.getCurrentUser()).getId() == post.getAuthor().getId()) {
				authorSection.setLayout(new GridLayout(7,0,0,0));
			}else {
				authorSection.setLayout(new GridLayout(7,0,0,0));
			}
		} else {
			authorSection.setLayout(new GridLayout(5,0,0,0));
		}
		
		authorSection.add(new JLabel("Post Rating: " + post.getRating()));
		authorSection.add(new JLabel("Post Views: " + post.getViews()));
		authorSection.add(new JLabel("Post Date: " + post.getDate().day + "/" + post.getDate().month + "/" + post.getDate().year));
		JLabel postAuthor = new JLabel("Author Name: " + post.getAuthor().getName());
		postAuthor.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		postAuthor.addMouseListener(new MouseAdapter() {
			
	        public void mouseClicked(MouseEvent e)   
	        {   
	        	setupProfile(post.getAuthor());
	            cl.show(panelCont, "8");
	        }   
	        
		});
		authorSection.add(postAuthor);
		String tags = "";
		for (int i = 0; i < post.getTagsList().toArray().length; i++) {
			tags += post.getTagsList().toArray()[i];
			if(i < post.getTagsList().toArray().length - 1) {
				tags += ",";
			}
		}
		authorSection.add(new JLabel("Post Tags: [" + tags + "]"));
		
		if(s.getCurrentUser() instanceof RegisteredUser) {
			if(((RegisteredUser)s.getCurrentUser()).getId() == post.getAuthor().getId()) {
				JButton editPost = new JButton("Edit Post");
				
				editPost.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setupEditPost(post);
						cl.show(panelCont, "7");
					}
				});
				authorSection.add(editPost);
				
				JButton removePost = new JButton("Delete Post");
				
				removePost.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						s.removePost(post);
						createFirstItems();
						cl.show(panelCont, "1");
					}
				});
				authorSection.add(removePost);
			}else {
				JButton upvote = new JButton("Upvote");
				
				upvote.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						post.increaseRating();
						setupPostVisualization(post);
						cl.show(panelCont, "1");
						cl.show(panelCont, "4");
					}
				});
				
				JButton downvote = new JButton("Downvote");
				
				downvote.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						post.decreaseRating();
						setupPostVisualization(post);
						cl.show(panelCont, "1");
						cl.show(panelCont, "4");
					}
				});
				authorSection.add(upvote);
				authorSection.add(downvote);
			}
		}

		
		titleSection.add(authorSection);
		
		JPanel contentSection = new JPanel();
		contentSection.add(new JLabel(UtilsGUI.convertToMultiline(post.getContent())));
		
		postSection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		postSection.add(titleSection);
		JScrollPane scrollPane = new JScrollPane(contentSection);
		postSection.add(scrollPane);
		
		Object[] currentComments = post.getCommentsList().toArray();
		if(currentComments.length == 0) {
			commentSection.setLayout(new GridLayout(1,0,0,10));
		}
		else {
				if(s.getCurrentUser() instanceof GuestUser) {
					commentSection.setLayout(new GridLayout(currentComments.length,0,0,10));
				} else {
					commentSection.setLayout(new GridLayout(currentComments.length+1,0,0,10));
				}
			}

		commentSection.removeAll();
		for(int i = 0; i < currentComments.length; i++) {
			Comment currComment = (Comment) currentComments[i];
			JPanel newComment = new JPanel();
			newComment.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			newComment.setLayout(new GridLayout(0,3,0,0));
			newComment.add(new Label(currComment.getContent()));
			JPanel authorComment = new JPanel();
			authorComment.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			authorComment.setLayout(new GridLayout(3,0,0,0));
			JLabel authorLabel = new JLabel("Author: " + currComment.getAuthor().getName(),SwingConstants.CENTER);
			authorLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			authorLabel.addMouseListener(new MouseAdapter() {
				
		        public void mouseClicked(MouseEvent e)   
		        {   
		        	setupProfile(currComment.getAuthor());
		            cl.show(panelCont, "8");
		        }   
		        
			});
			authorComment.add(authorLabel);
			authorComment.add(new JLabel("Date: " + currComment.getDate().day + "/" + currComment.getDate().month + "/" + currComment.getDate().year,SwingConstants.CENTER));
			authorComment.add(new JLabel("Rating: " + currComment.getRating(),SwingConstants.CENTER));
			newComment.add(authorComment);

			if(s.getCurrentUser() instanceof GuestUser) {
				commentSection.add(newComment);
				continue;
			}
			JPanel voteActions = new JPanel();
			voteActions.setLayout(new GridLayout(2,0,0,0));
			JButton upvoteComment = new JButton("Upvote");
			
			upvoteComment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						currComment.increaseRating();
						setupPostVisualization(post);
						cl.show(panelCont, "1");
						cl.show(panelCont, "4");
					} catch (Exception ex1) {
						
					}
				}
			});
			
			JButton downvoteComment = new JButton("Downvote");
			
			downvoteComment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						currComment.decreaseRating();
						setupPostVisualization(post);
						cl.show(panelCont, "1");
						cl.show(panelCont, "4");
					} catch (Exception ex1) {
						
					}
				}
			});
			
			voteActions.add(upvoteComment);
			voteActions.add(downvoteComment);
			newComment.add(voteActions);
			newComment.setPreferredSize(new Dimension(100,150));
			commentSection.add(newComment);
		}
		if(s.getCurrentUser() instanceof GuestUser) {
			return;
		}
		JPanel createComment = new JPanel();
		createComment.setPreferredSize(new Dimension(100,100));
		createComment.setLayout(new GridLayout(2,0,0,0));
		createComment.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		JTextArea newCommentEntry = new JTextArea();
		JButton addNewComment = new JButton("Add new comment");
		
		addNewComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Calendar now = Calendar.getInstance();
					post.addComment(new Comment(newCommentEntry.getText(),(RegisteredUser)s.getCurrentUser(),now.get(Calendar.DAY_OF_MONTH),now.get(Calendar.MONTH)+1,now.get(Calendar.YEAR)));
					setupPostVisualization(post);
					cl.show(panelCont, "1");
					cl.show(panelCont, "4");
				} catch (Exception ex1) {
					
				}
			}
		});
		
		createComment.add(newCommentEntry);
		createComment.add(addNewComment);
		commentSection.add(createComment);
	}
	
	private void setupEditPost(Post post) {
		selectedPost = post;
		postTitleEntry.setText(UtilsGUI.convertToMultilineTextArea(post.getTitle()));
		
		postContentEntry.setText(UtilsGUI.convertToMultilineTextArea(post.getContent()));
		
		String tags = "";
		Object[] tagList = post.getTagsList().toArray();
		for(int i = 0; i < tagList.length; i++) {
			tags += tagList[i];
			if(i < tagList.length-1) {
				tags +=",";
			}
		}
		postTagsEntry.setText(tags);
	}
	
	private void setupProfile(RegisteredUser user) {
		profileEntries.removeAll();
		panel_20.removeAll();
		if(s.getCurrentUser() instanceof RegisteredUser && user.getId() == ((RegisteredUser) s.getCurrentUser()).getId() ) {
			profileEntries.setLayout(new GridLayout(5, 0, 0, 10));
			
			JTextField profileName = new JTextField(user.getName());
			JTextField profileAge = new JTextField(user.getAge().toString());
			JTextField profileEmail = new JTextField(user.getEmail());
			JComboBox profileSex = new JComboBox(new String[] {"Male","Female"});
			JLabel profileUsername = new JLabel(user.getUsername());
			
			if(user.getSex() instanceof MasculinoQuote) {
				profileSex.setSelectedIndex(0);
			} else {
				profileSex.setSelectedIndex(1);
			}
			
			profileName.setHorizontalAlignment(SwingConstants.CENTER);
			profileName.setColumns(10);
						
			profileAge.setHorizontalAlignment(SwingConstants.CENTER);
			profileAge.setColumns(10);
			
			profileEmail.setHorizontalAlignment(SwingConstants.CENTER);
			profileEmail.setColumns(10);
			
			profileUsername.setHorizontalAlignment(SwingConstants.CENTER);
			
			profileEntries.add(profileName);
			profileEntries.add(profileAge);
			profileEntries.add(profileEmail);
			profileEntries.add(profileSex);
			profileEntries.add(profileUsername);
			
			JButton btnEditProfile = new JButton("Edit Profile");
			btnEditProfile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						panelResultsContent.removeAll();
						Object sex;
						if(profileSex.getSelectedIndex() == 0) {
							sex = new MasculinoQuote();
						} else {
							sex = new FemininoQuote();
						}
						s.editUser(profileName.getText(), profileEmail.getText(), Integer.parseInt(profileAge.getText()), sex);
						cl.show(panelCont, "1");
					} catch (Exception ex1) {
						
					}
				}
			});
			panel_20.add(btnEditProfile);
		} else {
			profileEntries.setLayout(new GridLayout(5, 0, 0, 10));
			
			JLabel profileName = new JLabel(user.getName());
			JLabel profileAge = new JLabel(user.getAge().toString());
			JLabel profileEmail = new JLabel(user.getEmail());
			JLabel profileSex = new JLabel();
			JLabel profileUsername = new JLabel(user.getUsername());
			
			if(user.getSex() instanceof MasculinoQuote) {
				profileSex.setText("Male");
			} else {
				profileSex.setText("Female");
			}
			
			profileName.setHorizontalAlignment(SwingConstants.CENTER);
						
			profileAge.setHorizontalAlignment(SwingConstants.CENTER);
			
			profileEmail.setHorizontalAlignment(SwingConstants.CENTER);

			profileSex.setHorizontalAlignment(SwingConstants.CENTER);
			
			profileUsername.setHorizontalAlignment(SwingConstants.CENTER);
			
			profileEntries.add(profileName);
			profileEntries.add(profileAge);
			profileEntries.add(profileEmail);
			profileEntries.add(profileSex);
			profileEntries.add(profileUsername);
		}
		int postCount = 0;
		int commentCount = 0;
		for(int i = 0; i < s.getPosts().toArray().length; i++) {
			Post currPost = (Post)s.getPosts().toArray()[i];
			if(currPost.getAuthor().getId() == user.getId()) {
				postCount++;
			}
			for(int j = 0; j < currPost.getCommentsList().toArray().length; j++) {
				if( ((Comment)currPost.getCommentsList().toArray()[i]).getAuthor().getId() == user.getId()) {
					commentCount++;
				}
			}
		}
		lblReputation.setText("Reputation: " + user.getReputation());
		lblPostsCount.setText("Posts Count: "+ postCount);
		lblCommentsCount.setText("   Comments Count: "+commentCount + "   ");
	}
	
}
