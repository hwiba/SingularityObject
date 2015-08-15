package me.singularity.comment.domain;

import me.singularity.user.domain.User;

public interface Comment {
	
	boolean isWriter(User user);
	
	void rewrite(String text);
	
	void delete();
}
