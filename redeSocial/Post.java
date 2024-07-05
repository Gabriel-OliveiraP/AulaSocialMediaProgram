package redeSocial;

import java.text.SimpleDateFormat;
import java.util.*;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date momment;
	private String title;
	private String content;
	private int likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {}

	public Post(Date momment, String title, String content, int likes) {
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment c : comments) {
			sb.append(c.getText()+ "\n");
		}
		return sb.toString();
		
	}
	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public void addCommment(Comment comment) {
		comments.add(comment);
	}
	public void removeCommment(Comment comment) {
		comments.remove(comment);
	}
	
}
