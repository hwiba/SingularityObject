package me.singularity.user.domain;

public interface User {
	
	void changeName(String name);
	
	void changeImage(String profileImage);
	
	void deleteUser();
	
	void accept();
	
	boolean isAccept();
	
	Long getId();
	
	void setId(Long id);
	
	void ready();
}
