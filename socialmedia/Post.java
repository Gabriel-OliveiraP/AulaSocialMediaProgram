package socialmedia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy HH:mm");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comment = new ArrayList<>();
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " likes - ");
		sb.append(fmt.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Commentarios: \n");
		for(Comment c : comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	public void like() {
		this.likes += 1;
	}
	public void unlike() {
		this.likes -= 1;
	}
	
	public void addComment(String comment) {
		this.comment.add(new Comment(comment));
	}
	
	public void removeComment(int commentNumber) {
		comment.get(commentNumber + 1 );
	}
	public List<Comment> getComment() {
		return comment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public Integer getLikes() {
		return likes;
	}
	
}
