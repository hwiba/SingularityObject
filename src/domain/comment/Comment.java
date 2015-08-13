package domain.comment;

import domain.user.User;

public interface Comment {
	
	boolean isWriter(User user);
	
	void rewrite(String text);
	
	void delete();
}
