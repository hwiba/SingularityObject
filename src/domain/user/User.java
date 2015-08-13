package domain.user;

public interface User {
	
	void changeName(String name);
	
	void changeImage(String profileImage);
	
	void deleteUser();
	
	void accept();
	
	boolean isAccept();
	
}
