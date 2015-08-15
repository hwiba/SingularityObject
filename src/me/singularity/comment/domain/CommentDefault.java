package me.singularity.comment.domain;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.singularity.user.domain.User;

@Getter
@EqualsAndHashCode
@ToString
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
