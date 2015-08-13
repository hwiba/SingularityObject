package domain.comment;

import java.util.Date;

import domain.user.User;
import lombok.Data;

@Data
public class CommentDefault implements Comment {
	
	private enum Status {
		ON, OFF
	}
	
	private Long id;
	private Date createDate;
	private User writer;
	private String text;
	private Status status;

	@Override
	public boolean isWriter(User user) {
		return this.writer.equals(user);
	}

	@Override
	public void rewrite(String text) {
		if (null == text) {
			return;
		}
		this.text = text;
	}

	@Override
	public void delete() {
		this.status = Status.OFF;
	}
	
}
